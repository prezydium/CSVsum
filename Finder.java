public class Finder {
    StringBuilder sbfinder = new StringBuilder();

    public String getResult() {
        return result;
    }

    String result;
    public Finder(String s) {

        Streets str1 = new Streets();

        for (int i = 0; i < str1.streets.length; i++) {
           String currentStreet= str1.chooseStreet(i);

            int howMany = 0;
            int x =0;
            while (s.indexOf(currentStreet, x)!=-1){
                x= s.indexOf(currentStreet, x) + 1;
                howMany++;
            }
            sbfinder.append(currentStreet + " " + howMany + "\n");
        }
    result = sbfinder.toString();
    }
}
