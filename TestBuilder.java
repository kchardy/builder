public class TestBuilder {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Anna")
                    .nazwisko("Kowalska")
                    .prawojazdy(true)
                    .waga(120)
                    .build();
        System.out.println(user);
        User user1 = new User.UserBuilder("Bolek")
                    .nazwisko("Zwada")
                    .adres("Aleksandrowska")
                    .wzrost(180)
                    .waga(80)
                    .build();
        System.out.println(user1);
        User nowy = new User.UserBuilder("Adam")
                    .nazwisko("Małysz")
                    .adres("Zakopane")
                    .wzrost(170)
                    .waga(55)
                    .build();
        System.out.println(nowy);

        }
    }


