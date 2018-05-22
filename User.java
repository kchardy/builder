import java.util.ArrayList;
import java.util.List;

public class User {

    private String imie;
    private String nazwisko;

    private String adres;
    private int wiek;
    private int waga;
    private int wzrost;
    private boolean prawojazdy;

    /**
     * constructor User with no parameters
     */
    public User()
    {

    }

    /**
     * function toString() displaying user params
     * @return needed string format
     */
    @Override
    public String toString() {
        List<String> output = new ArrayList<>();
        if(!nazwisko.equals("")){
            output.add("nazwisko: " + nazwisko);
        }
        if(!adres.equals("")){
            output.add("adres: " + adres);
        }
        if(wiek!=0){
            output.add("wiek: " + Integer.toString(wiek));
        }
        if(waga!=0){
            output.add("waga: " + Integer.toString(waga));
        }
        if(wzrost!=0){
            output.add("wzrost: " + Integer.toString(wzrost));
        }
        if(prawojazdy){
            output.add("prawojazdy: true");
        }

        return String.format("User: "+ imie+"\n"
                + "%s", output);
    }

    /**
     * custom builder to create user
     */
    public static class UserBuilder {

        private String imie = "";
        private String nazwisko = "";

        private String adres = "";
        private int wiek = 0;
        private int waga = 0;
        private int wzrost = 0;
        private boolean prawojazdy = false;
        /**
         * constructor UserBuilder
         * @param imie required field
         */
        public UserBuilder(String imie) {
            this.imie = imie;
        }

        public UserBuilder imie (String imie) {
            this.imie = imie;
            return this;
        }
        public UserBuilder nazwisko (String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }
        public UserBuilder adres (String adres) {
            this.adres = adres;
            return this;
        }
        public UserBuilder wiek (int wiek) {
            this.wiek = wiek;
            return this;
        }
        public UserBuilder waga (int waga) {
            this.waga = waga;
            return this;
        }
        public UserBuilder wzrost (int wzrost) {
            this.wzrost = wzrost;
            return this;
        }
        public UserBuilder prawojazdy (boolean prawojazdy) {
            this.prawojazdy = prawojazdy;
            return this;
        }

        /**
         * function build() create new object user with specified parameters
         * @return user object
         */
        public User build() {
            User user = new User();
            user.imie = this.imie;
            user.nazwisko = this.nazwisko;
            user.adres = this.adres;
            user.wiek = this.wiek;
            user.wzrost = this.wzrost;
            user.waga = this.waga;
            user.prawojazdy = this.prawojazdy;
            return user;

        }

    }
}
