public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language (String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println( this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".\nThe language follows the word order: " + this.wordOrder);
    }

    public static void main(String[] args) {
        Language English = new Language("English", 200000, "America", "Subject-Verb-Noun");
        English.getInfo();

        Mayan Chontal = new Mayan("Chontal", 36810);
        Chontal.getInfo();

        SinoTibetan MandarinChinese = new SinoTibetan("Chinese", 9999999);
        MandarinChinese.getInfo();

        SinoTibetan Bermese = new SinoTibetan("Bermese", 9999999);
        MandarinChinese.getInfo();
    }
}