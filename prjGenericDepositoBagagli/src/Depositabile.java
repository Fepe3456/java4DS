public interface Depositabile {
    int identificativo = 0;
    int getIdentificativo();
    void deposita();
    void ritira(int identificativo);

}
