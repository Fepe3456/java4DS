import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label lblTitolo = new Label("\uD83D\uDCC8 Calcolatore Interesse");
        lblTitolo.setFont(Font.font("Verdana", FontWeight.BOLD, 28));
        lblTitolo.setTextFill(Color.web("#2c3e50"));

        // Tipo interesse
        Label lblTipo = new Label("Tipo di Interesse");
        lblTipo.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        RadioButton rButtonSemplice = new RadioButton("Semplice");
        RadioButton rButtonComposto = new RadioButton("Composto");
        ToggleGroup toggleGroup1 = new ToggleGroup();
        rButtonSemplice.setToggleGroup(toggleGroup1);
        rButtonComposto.setToggleGroup(toggleGroup1);
        VBox vBoxTipo = new VBox(8, lblTipo, rButtonSemplice, rButtonComposto);

        // Durata anni
        Label lblAnni = new Label("Durata (anni)");
        lblAnni.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        RadioButton rButton1Anni = new RadioButton("1 anno");
        RadioButton rButton5Anni = new RadioButton("5 anni");
        RadioButton rButton10Anni = new RadioButton("10 anni");
        RadioButton rButton15Anni = new RadioButton("15 anni");
        RadioButton rButton20Anni = new RadioButton("20 anni");
        ToggleGroup toggleGroup2 = new ToggleGroup();
        rButton1Anni.setToggleGroup(toggleGroup2);
        rButton5Anni.setToggleGroup(toggleGroup2);
        rButton10Anni.setToggleGroup(toggleGroup2);
        rButton15Anni.setToggleGroup(toggleGroup2);
        rButton20Anni.setToggleGroup(toggleGroup2);
        VBox vBoxAnni = new VBox(8, lblAnni, rButton1Anni, rButton5Anni, rButton10Anni, rButton15Anni, rButton20Anni);

        // Campi input
        Label lblCapitale = new Label("Capitale iniziale (€)");
        lblCapitale.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        TextField txtField1 = new TextField();
        txtField1.setPromptText("Es. 1000");

        Label lblTasso = new Label("Tasso di interesse (%)");
        lblTasso.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        TextField txtField2 = new TextField();
        txtField2.setPromptText("Es. 1.5");

        VBox vBoxInput = new VBox(15, lblCapitale, txtField1, lblTasso, txtField2);

        // Pulsante calcolo
        Button bCalcola = new Button("\uD83D\uDCB0 CALCOLA");
        bCalcola.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 14;");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Interesse interesse = new Interesse();

        bCalcola.setOnAction(event -> {
            try {
                Toggle selectedToggleAnni = toggleGroup2.getSelectedToggle();
                int anni = 1;
                if (selectedToggleAnni instanceof RadioButton) {
                    anni = Integer.parseInt(((RadioButton) selectedToggleAnni).getText().split(" ")[0]);
                }

                double capitale = Double.parseDouble(txtField1.getText());
                double tasso = Double.parseDouble(txtField2.getText());

                Toggle selectedToggleTipo = toggleGroup1.getSelectedToggle();
                if (selectedToggleTipo == null) {
                    alert.setTitle("Errore");
                    alert.setHeaderText("Tipo non selezionato");
                    alert.setContentText("Seleziona 'Semplice' o 'Composto'");
                    alert.showAndWait();
                    return;
                }

                String scelta = ((RadioButton) selectedToggleTipo).getText();
                double risultato = scelta.equals("Semplice")
                        ? interesse.semplice(capitale, anni, tasso)
                        : interesse.composto(capitale, anni, tasso);

                alert.setTitle("Risultato");
                alert.setHeaderText("Montante calcolato");
                alert.setContentText(String.format("Risultato: %.2f €", risultato));
                alert.showAndWait();

            } catch (NumberFormatException e) {
                alert.setTitle("Errore di input");
                alert.setHeaderText("Formato errato");
                alert.setContentText("Inserisci solo numeri validi nei campi.");
                alert.showAndWait();
            }
        });

        VBox vBoxAzioni = new VBox(20, vBoxTipo, bCalcola);

        // Layout principale
        VBox titoloBox = new VBox(lblTitolo);
        titoloBox.setAlignment(Pos.CENTER);

        HBox corpo = new HBox(50, vBoxAnni, vBoxInput, vBoxAzioni);
        corpo.setAlignment(Pos.TOP_CENTER);
        corpo.setPadding(new javafx.geometry.Insets(30));

        VBox layout = new VBox(30, titoloBox, corpo);
        layout.setStyle("-fx-background-color: linear-gradient(to bottom, #ecf0f1, #bdc3c7);");

        Scene scena = new Scene(layout, 850, 450);
        primaryStage.setScene(scena);
        primaryStage.setTitle("\uD83D\uDCB3 Calcolo Interesse");
        primaryStage.show();
    }
}