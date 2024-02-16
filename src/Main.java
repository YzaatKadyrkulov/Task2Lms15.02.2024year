import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Deadline : 16.02.2024 / 17:00
         * University, School, Car жана Person деген класс тузунуз
         *
         * Алардын свойстваларын ойлоп табыныз
         *
         * Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
         *
         * Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
         *
         * Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз
         */
//        System.out.println("Class 1:");
        Person person = new Person();
        person.setSmart("Aziret");
        person.setFlexible("Aziret");
        person.setExtrovert("Aziret");

//                 System.out.println("Class 1:");
        Cow cow = new Cow("Jdanka","white",1);

        Bear bear = new Bear("brown",3,2);

        Telephone telephone = new Telephone("Android","black",25000);

//                 System.out.println("Class 2");
        Car car = new Car();
        car.setBlack("Black");
        car.setLamborghini("Lamborghini");
        car.setNew("New");

        Crocodile crocodile = new Crocodile("Green",1,2);

        Cat cat = new Cat("Mimusiya","America cat",2);

        Sheep sheep = new Sheep("black","M",2);

//                System.out.println("Class 3");
        University university = new University();
        university.setHarvard("Harvard");
        university.setBigBuilding("BigBuilding");
        university.setBigDiningRoom("BigDiningRoom");

        Horse horse = new Horse("Mustang",23,"brawn");

        Bull bull = new Bull("Mishka","white",2);

        Hippopotamus hippopotamus = new Hippopotamus("Hippopotamus",2,"brawn");

//               System.out.println("Class 4");
        School school = new School();
        school.setOsshln11("Osshln11");
        school.setSmallBuilding("SmallBuilding");
        school.setSmallBuilding("SpecialTeachers");

        Human human = new Human("Eldos",18,"Samsy");

        Bread bread = new Bread("Bolko","brawnAndWhite","tasty");

        Tea tea = new Tea("Maiskiy","red","tasty");




        System.out.println("Class 1");
        Person[] personAziret= {person};
        Cow [] cowMeaning = {cow};
        Bear[] bearMeaning = {bear};
        Telephone[] telephoneMeaning = {telephone};

        System.out.println("Class 1");
        System.out.println("\nPerson:");
        for (Person personMeaning : personAziret) {
            System.out.println("Smart: " + personMeaning.getSmart() + ", Flexible: " + personMeaning.getFlexible() + ", Extrovert: " + personMeaning.getExtrovert());
        }
        System.out.println("Class 1");

        System.out.println("\nCow:");
        for (Cow cowMaanisi : cowMeaning) {
            System.out.println("Name: " + cowMaanisi.name + ", Color: " + cowMaanisi.color + ", Age: " + cowMaanisi.age);
        }
        System.out.println("Class 1");

        System.out.println("\nBear:");
        for (Bear bearMaanisi : bearMeaning) {
            System.out.println("Color: " + bearMaanisi.color + ", Height: " + bearMaanisi.height + ", Age: " + bearMaanisi.age);
        }
        System.out.println("Class 1");

        System.out.println("\nTelephone:");
        for (Telephone phone : telephoneMeaning) {
            System.out.println("Modal: " + phone.modal + ", Color: " + phone.color + ", Price: $" + phone.price);
        }

        System.out.println("Class 2");
        Car[] carMeaning = {car};
        Crocodile[] crocodileMeaning = {crocodile};
        Cat[] catMeaning = {cat};
        Sheep[] sheepMeaning = {sheep};

        System.out.println("Class 2");

        System.out.println("\nCar:");
        for (Car mashine : carMeaning) {
            System.out.println("Smart: " + mashine.getBlack() + ", Flexible: " + mashine.getLamborghini() + ", Extrovert: " + mashine.getNew());
        }
        System.out.println("Class 2");

        System.out.println("\nCrocodile:");
        for (Crocodile crocodileMaanisi  : crocodileMeaning) {
            System.out.println("Color: " + crocodileMaanisi.color + ", Age: " + crocodileMaanisi.age + ", SizeOfLong: " + crocodileMaanisi.sizeOfLong);
        }
        System.out.println("Class 2");

        System.out.println("\nCat:");
        for (Cat catMaanisi : catMeaning) {
            System.out.println("Name: " + catMaanisi.name + ", Breed: " + catMaanisi.breed + ", Age: " + catMaanisi.age);
        }
        System.out.println("Class 2");

        System.out.println("\nSheep:");
        for (Sheep sheepMaanisi : sheepMeaning) {
            System.out.println("Color: " + sheepMaanisi.color + ", Sex: " + sheepMaanisi.sex + ", Age: $" + sheepMaanisi.age);
        }

        System.out.println("Class 3");
        University[] universityMeaning = {university};
        Horse[] horseMeaning = {horse};
        Bull[] bullMeaning = {bull};
        Hippopotamus[] hippopotamusMeaning = {hippopotamus};

        System.out.println("Class 3");

        System.out.println("\nUniversity:");
        for (University universityMaanisi : universityMeaning) {
            System.out.println("Harvard: " + universityMaanisi.getHarvard() + ", BigDiningRoom: " + universityMaanisi.getBigDiningRoom() + ", BigBuilding: " + universityMaanisi.getBigBuilding());
        }
        System.out.println("Class 3");

        System.out.println("\nHorse:");
        for (Horse horseMaanisi  : horseMeaning) {
            System.out.println("Name: " + horseMaanisi.name + ", Age: " + horseMaanisi.age + ", Color: " + horseMaanisi.color);
        }
        System.out.println("Class 3");

        System.out.println("\nBull:");
        for (Bull  bullMaanisi  : bullMeaning) {
            System.out.println("Name: " + bullMaanisi.name + ", Breed: " + bullMaanisi.breed + ", Age: " + bullMaanisi.age);
        }

        System.out.println("Class 3");

        System.out.println("\nHippopotamus:");
        for (Hippopotamus hippopotamusMaanisi : hippopotamusMeaning) {
            System.out.println("Name: " + hippopotamusMaanisi.name + ", Age: " + hippopotamusMaanisi.age + ", Color: $" + hippopotamusMaanisi.color);
        }

        System.out.println("Class 4");
        School[] schoolMeaning = {school};
        Human[] humanMeaning = {human};
        Bread[] breadMeaning = {bread};
        Tea[] teaMeaning = {tea};

        System.out.println("Class 4");

        System.out.println("\nSchool");
        for (School schoolMaanisi : schoolMeaning) {
            System.out.println("Osshln11: " + schoolMaanisi.getOsshln11() + ", SmallBuilding: " + schoolMaanisi.getSmallBuilding() + ", SpecialTeachers: " + schoolMaanisi.getSpecialTeachers());
        }
        System.out.println("Class 4");

        System.out.println("\nHuman:");
        for (Human humanMaanisi  : humanMeaning) {
            System.out.println("Name: " + humanMaanisi.name + ", Age: " + humanMaanisi.age + ", FavoriteMeal: " + humanMaanisi.favoriteMeal);
        }
        System.out.println("Class 4");

        System.out.println("\nBread:");
        for (Bread  breadMaanisi  : breadMeaning) {
            System.out.println("ViewOfBread: " + breadMaanisi.ViewOfBread + ", color: " + breadMaanisi.color + ", tasty: " + breadMaanisi.tasty);
        }

        System.out.println("Class 4");

        System.out.println("\nTea:");
        for (Tea teaMaanisi : teaMeaning) {
            System.out.println("Name: " + teaMaanisi.name + ", color: " + teaMaanisi.color + ", tasty: $" + teaMaanisi.tasty);
        }









    }
}




