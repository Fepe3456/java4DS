import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {

        int n_nodes = 10; //Number of nodes
        float[][] G = new float[n_nodes][n_nodes];
        int[] NI = new int[n_nodes];
        int currentNode;
        int steps = 1000; //Number of steps (1000 is a random number)

        //Initialize graph and importance
        initializeGraph(G, n_nodes);
        initializeImportance(NI);

        currentNode = 0; //First node

        //Simulation move spider
        for(int i=0; i<steps; i++){
            currentNode = moveSpider(G, NI, currentNode, n_nodes);
        }

        System.out.println(printImportance(NI, n_nodes));

    }

    static void initializeGraph(float[][] G, int n_nodes){
        for(int i=0; i<n_nodes; i++){
            for(int j=0; j<n_nodes; j++){
                G[i][j] = random.nextInt(2);
            }
        }
    }
    static void initializeImportance(int[] NI){
        for(int i=0; i< NI.length; i++){
            NI[i] = 0;
        }
    }

    static int moveSpider(float[][] G, int[] NI, int currentNode, int n_nodes){
        List<Integer> neighbors = new ArrayList<>();
        //Find neighbors
        for(int i=0; i<n_nodes; i++){
            if( G[currentNode][i] > 0 ){
                neighbors.add(i);
            }
        }
        //If the node has not link --> random
        if( neighbors.isEmpty() ){
            currentNode = random.nextInt(n_nodes);
        }
        else{
            //.get() return the element, in this case, at a position random
            int nextNode = neighbors.get( random.nextInt(neighbors.size()) );
            NI[ nextNode ] ++;
            currentNode = nextNode;
        }
        return currentNode;
    }

    static String printImportance(int[] NI, int n_nodes){
        String str = "Importance of nodes: ";
        for(int i=0; i<n_nodes; i++){
            str += "\n   Node " + i + " has importance " + NI[i];
        }
        return str;
    }

}