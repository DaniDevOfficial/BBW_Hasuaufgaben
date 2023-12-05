import java.awt.Color;
import java.util.*;

public class CEO implements Comparable<CEO> {
    @Override
    public int compareTo(CEO other) {
        return Double.compare(this.netWorth, other.netWorth);
    }

    // region Comparators

    public static final Comparator<CEO> FirstNameComparator = Comparator.comparing(CEO::getFirstName);
    public static final Comparator<CEO> LastNameComparator = Comparator.comparing(CEO::getLastName);
    public static final Comparator<CEO> NetWorthComparator = Comparator.comparingDouble(CEO::getNetWorth);

    public static final Comparator<CEO> OfficeColorComparator = Comparator.comparing(ceo -> ceo.officeColor.getRGB());
    public static final Comparator<CEO> CompanyNameComparator = Comparator.comparing(ceo -> ceo.company.getName());
    public static final Comparator<CEO> PetTypeComparator = Comparator.comparing(ceo -> ceo.pet.getAnimalType());

    public static final Comparator<CEO> AgeComparator = Comparator.comparingInt(CEO::getAge);
    public static final Comparator<CEO> NameComparator = Comparator.comparing(CEO::getLastName)
            .thenComparing(CEO::getFirstName);

    public static final Comparator<CEO> MehrstufigerVergleich =
            NameComparator.thenComparing(AgeComparator)
                    .thenComparing(CompanyNameComparator);
    private String firstName;
    private String lastName;
    private double netWorth;
    private int age;
    private Color officeColor;
    private Company company;
    private Pet pet;
    // endregion
    // region Setters and Getters
    public CEO(String firstName, String lastName, double netWorth, int age, Color officeColor, Company company, Pet pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.netWorth = netWorth;
        this.age = age;
        this.officeColor = officeColor;
        this.company = company;
        this.pet = pet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getOfficeColor() {
        return officeColor;
    }

    public void setOfficeColor(Color officeColor) {
        this.officeColor = officeColor;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    // endregion
    // Main method
    public static void main(String[] args) {
        List<CEO> ceos = new ArrayList<>();
        // region Ceo Data 101

        ceos.add(new CEO("John", "Doe", 1000000000.0, 35, Color.BLUE, new Company("ABC Corp", "Technology"), new Pet("Fluffy", "Cat")));
        ceos.add(new CEO("Jane", "Smith", 800000000.0, 40, Color.RED, new Company("XYZ Inc", "Finance"), new Pet("Buddy", "Dog")));
        ceos.add(new CEO("Mike", "Johnson", 1200000000.0, 45, Color.GREEN, new Company("123 Enterprises", "Retail"), new Pet("Whiskers", "Hamster")));
        ceos.add(new CEO("Emily", "Jones", 950000000.0, 38, Color.YELLOW, new Company("Tech Innovators", "Technology"), new Pet("Max", "Dog")));
        ceos.add(new CEO("David", "Williams", 1100000000.0, 42, Color.ORANGE, new Company("Finance Solutions", "Finance"), new Pet("Cleo", "Cat")));
        ceos.add(new CEO("Sophia", "Brown", 850000000.0, 39, Color.PINK, new Company("Global Retailers", "Retail"), new Pet("Rocky", "Dog")));
        ceos.add(new CEO("Aiden", "White", 1050000000.0, 43, Color.CYAN, new Company("Innovate Tech", "Technology"), new Pet("Oliver", "Parrot")));
        ceos.add(new CEO("Grace", "Anderson", 900000000.0, 36, Color.MAGENTA, new Company("Financial Experts", "Finance"), new Pet("Luna", "Cat")));
        ceos.add(new CEO("Ethan", "Wilson", 1150000000.0, 47, Color.LIGHT_GRAY, new Company("Smart Retail", "Retail"), new Pet("Simba", "Dog")));
        ceos.add(new CEO("Lily", "Miller", 920000000.0, 41, Color.DARK_GRAY, new Company("Tech Solutions", "Technology"), new Pet("Milo", "Cat")));
        ceos.add(new CEO("Henry", "Taylor", 980000000.0, 38, Color.BLUE, new Company("Financial Innovations", "Finance"), new Pet("Charlie", "Dog")));
        ceos.add(new CEO("Zoe", "Clark", 1080000000.0, 44, Color.RED, new Company("Global Retail Solutions", "Retail"), new Pet("Chloe", "Cat")));
        ceos.add(new CEO("Owen", "Moore", 930000000.0, 37, Color.GREEN, new Company("Tech Pioneers", "Technology"), new Pet("Ruby", "Dog")));
        ceos.add(new CEO("Emma", "Evans", 1075000000.0, 43, Color.YELLOW, new Company("Financial Innovators Inc.", "Finance"), new Pet("Leo", "Parrot")));
        ceos.add(new CEO("Carter", "Turner", 940000000.0, 38, Color.ORANGE, new Company("Global Retail Hub", "Retail"), new Pet("Lucy", "Cat")));
        ceos.add(new CEO("Mia", "Harris", 1230000000.0, 49, Color.PINK, new Company("Tech Revolution", "Technology"), new Pet("Maximus", "Dog")));
        ceos.add(new CEO("Leo", "Cooper", 970000000.0, 37, Color.CYAN, new Company("Financial Experts Ltd.", "Finance"), new Pet("Bella", "Cat")));
        ceos.add(new CEO("Ava", "Bennett", 1160000000.0, 45, Color.MAGENTA, new Company("Retail Innovate", "Retail"), new Pet("Jack", "Dog")));
        ceos.add(new CEO("Noah", "Reed", 1030000000.0, 42, Color.LIGHT_GRAY, new Company("Tech Solutions Group", "Technology"), new Pet("Ziggy", "Parrot")));
        ceos.add(new CEO("Olivia", "Ward", 1250000000.0, 46, Color.DARK_GRAY, new Company("Global Retail Ventures", "Retail"), new Pet("Sasha", "Cat")));
        ceos.add(new CEO("Liam", "Fisher", 990000000.0, 39, Color.BLUE, new Company("Tech Innovate", "Technology"), new Pet("Whiskey", "Dog")));
        ceos.add(new CEO("Chloe", "Russell", 1020000000.0, 41, Color.RED, new Company("Finance Pros", "Finance"), new Pet("Mittens", "Cat")));
        ceos.add(new CEO("Lucas", "Cole", 1180000000.0, 44, Color.GREEN, new Company("Global Retail Solutions", "Retail"), new Pet("Coco", "Dog")));
        ceos.add(new CEO("Aria", "Fletcher", 960000000.0, 37, Color.YELLOW, new Company("Tech Pioneers", "Technology"), new Pet("Lola", "Cat")));
        ceos.add(new CEO("Jackson", "Carter", 1210000000.0, 48, Color.ORANGE, new Company("Financial Innovations Inc.", "Finance"), new Pet("Zeus", "Parrot")));
        ceos.add(new CEO("Madison", "Reyes", 970000000.0, 38, Color.PINK, new Company("Global Retail Hub", "Retail"), new Pet("Shadow", "Dog")));
        ceos.add(new CEO("Elijah", "Woods", 1130000000.0, 43, Color.CYAN, new Company("Tech Revolution", "Technology"), new Pet("Sophie", "Cat")));
        ceos.add(new CEO("Avery", "Gray", 940000000.0, 36, Color.MAGENTA, new Company("Financial Experts Ltd.", "Finance"), new Pet("Rocky", "Dog")));
        ceos.add(new CEO("Logan", "Perry", 1260000000.0, 47, Color.LIGHT_GRAY, new Company("Retail Innovate", "Retail"), new Pet("Oscar", "Cat")));
        ceos.add(new CEO("Abigail", "Cruz", 1050000000.0, 42, Color.DARK_GRAY, new Company("Tech Solutions Group", "Technology"), new Pet("Bentley", "Dog")));
        ceos.add(new CEO("Caleb", "Kim", 1120000000.0, 45, Color.BLUE, new Company("Global Retail Ventures", "Retail"), new Pet("Lily", "Parrot")));
        ceos.add(new CEO("Harper", "Schmidt", 950000000.0, 38, Color.RED, new Company("Tech Innovators", "Technology"), new Pet("Tiger", "Cat")));
        ceos.add(new CEO("Ryan", "Vargas", 1160000000.0, 46, Color.GREEN, new Company("Financial Solutions", "Finance"), new Pet("Daisy", "Dog")));
        ceos.add(new CEO("Evelyn", "Li", 1080000000.0, 43, Color.YELLOW, new Company("Global Retailers", "Retail"), new Pet("Charlie", "Parrot")));
        ceos.add(new CEO("Isaac", "Yu", 980000000.0, 39, Color.ORANGE, new Company("Innovate Tech", "Technology"), new Pet("Mia", "Cat")));
        ceos.add(new CEO("Aaliyah", "Chen", 1190000000.0, 47, Color.PINK, new Company("Financial Experts", "Finance"), new Pet("Maximus", "Dog")));
        ceos.add(new CEO("Grayson", "Wang", 990000000.0, 38, Color.CYAN, new Company("Smart Retail", "Retail"), new Pet("Smokey", "Cat")));
        ceos.add(new CEO("Ellie", "Huang", 1075000000.0, 44, Color.MAGENTA, new Company("Tech Pioneers", "Technology"), new Pet("Ziggy", "Parrot")));
        ceos.add(new CEO("Daniel", "Zhang", 950000000.0, 37, Color.LIGHT_GRAY, new Company("Financial Innovators Inc.", "Finance"), new Pet("Luna", "Dog")));
        ceos.add(new CEO("Paisley", "Huang", 1240000000.0, 49, Color.DARK_GRAY, new Company("Global Retail Hub", "Retail"), new Pet("Simba", "Cat")));
        ceos.add(new CEO("Mateo", "Feng", 1000000000.0, 40, Color.BLUE, new Company("Tech Revolution", "Technology"), new Pet("Milo", "Dog")));
        ceos.add(new CEO("Mila", "Wu", 1110000000.0, 45, Color.RED, new Company("Financial Innovations", "Finance"), new Pet("Oliver", "Parrot")));
        ceos.add(new CEO("Santiago", "Cheng", 970000000.0, 38, Color.GREEN, new Company("Global Retail Solutions", "Retail"), new Pet("Chloe", "Cat")));
        ceos.add(new CEO("Luna", "Zhang", 1180000000.0, 46, Color.YELLOW, new Company("Tech Innovate", "Technology"), new Pet("Leo", "Dog")));
        ceos.add(new CEO("Zachary", "Yang", 1020000000.0, 42, Color.ORANGE, new Company("Finance Pros", "Finance"), new Pet("Bella", "Cat")));
        ceos.add(new CEO("Hazel", "Chen", 1150000000.0, 45, Color.PINK, new Company("Global Retail Solutions", "Retail"), new Pet("Jack", "Dog")));
        ceos.add(new CEO("Ezra", "Li", 990000000.0, 39, Color.CYAN, new Company("Tech Pioneers", "Technology"), new Pet("Lily", "Parrot")));
        ceos.add(new CEO("Penelope", "Wang", 1040000000.0, 41, Color.MAGENTA, new Company("Global Retail Hub", "Retail"), new Pet("Ziggy", "Cat")));
        ceos.add(new CEO("Austin", "Gao", 1125000000.0, 47, Color.LIGHT_GRAY, new Company("Tech Revolution", "Technology"), new Pet("Luna", "Dog")));
        ceos.add(new CEO("Stella", "Zhang", 1030000000.0, 42, Color.DARK_GRAY, new Company("Financial Experts Ltd.", "Finance"), new Pet("Charlie", "Cat")));
        ceos.add(new CEO("Xavier", "Huang", 1005000000.0, 40, Color.BLUE, new Company("Innovate Tech", "Technology"), new Pet("Mittens", "Cat")));
        ceos.add(new CEO("Violet", "Zhang", 1140000000.0, 44, Color.RED, new Company("Financial Innovations", "Finance"), new Pet("Coco", "Dog")));
        ceos.add(new CEO("Leon", "Chen", 970000000.0, 37, Color.GREEN, new Company("Global Retail Solutions", "Retail"), new Pet("Lola", "Cat")));
        ceos.add(new CEO("Caroline", "Wu", 1210000000.0, 48, Color.ORANGE, new Company("Tech Pioneers", "Technology"), new Pet("Zeus", "Parrot")));
        ceos.add(new CEO("Eli", "Zhang", 980000000.0, 39, Color.PINK, new Company("Global Retail Hub", "Retail"), new Pet("Shadow", "Dog")));
        ceos.add(new CEO("Madeline", "Cheng", 1130000000.0, 43, Color.CYAN, new Company("Tech Revolution", "Technology"), new Pet("Sophie", "Cat")));
        ceos.add(new CEO("Damian", "Feng", 940000000.0, 36, Color.MAGENTA, new Company("Financial Experts Ltd.", "Finance"), new Pet("Rocky", "Dog")));
        ceos.add(new CEO("Harmony", "Wang", 1260000000.0, 47, Color.LIGHT_GRAY, new Company("Retail Innovate", "Retail"), new Pet("Oscar", "Cat")));
        ceos.add(new CEO("Justin", "Huang", 1050000000.0, 42, Color.DARK_GRAY, new Company("Tech Solutions Group", "Technology"), new Pet("Bentley", "Dog")));
        ceos.add(new CEO("Alice", "Cruz", 1120000000.0, 45, Color.BLUE, new Company("Global Retail Ventures", "Retail"), new Pet("Lily", "Parrot")));
        ceos.add(new CEO("Zane", "Schmidt", 950000000.0, 38, Color.RED, new Company("Tech Innovators", "Technology"), new Pet("Tiger", "Cat")));
        ceos.add(new CEO("Amara", "Vargas", 1160000000.0, 46, Color.GREEN, new Company("Financial Solutions", "Finance"), new Pet("Daisy", "Dog")));
        ceos.add(new CEO("Hudson", "Li", 1080000000.0, 43, Color.YELLOW, new Company("Global Retailers", "Retail"), new Pet("Charlie", "Parrot")));
        ceos.add(new CEO("Athena", "Chen", 980000000.0, 39, Color.ORANGE, new Company("Innovate Tech", "Technology"), new Pet("Mia", "Cat")));
        ceos.add(new CEO("Wesley", "Wu", 1190000000.0, 47, Color.PINK, new Company("Financial Experts", "Finance"), new Pet("Maximus", "Dog")));
        ceos.add(new CEO("Kai", "Wang", 990000000.0, 38, Color.CYAN, new Company("Smart Retail", "Retail"), new Pet("Smokey", "Cat")));
        ceos.add(new CEO("Selena", "Huang", 1075000000.0, 44, Color.MAGENTA, new Company("Tech Pioneers", "Technology"), new Pet("Ziggy", "Parrot")));
        ceos.add(new CEO("Joel", "Zhang", 950000000.0, 37, Color.LIGHT_GRAY, new Company("Financial Innovators Inc.", "Finance"), new Pet("Luna", "Dog")));
        ceos.add(new CEO("Lila", "Perry", 1240000000.0, 49, Color.DARK_GRAY, new Company("Global Retail Hub", "Retail"), new Pet("Simba", "Cat")));
        ceos.add(new CEO("Brody", "Feng", 1000000000.0, 40, Color.BLUE, new Company("Tech Revolution", "Technology"), new Pet("Milo", "Dog")));
        ceos.add(new CEO("Eva", "Wu", 1110000000.0, 45, Color.RED, new Company("Financial Innovations", "Finance"), new Pet("Oliver", "Parrot")));
        ceos.add(new CEO("Rhys", "Cheng", 970000000.0, 38, Color.GREEN, new Company("Global Retail Solutions", "Retail"), new Pet("Chloe", "Cat")));
        ceos.add(new CEO("Kayden", "Zhang", 1180000000.0, 46, Color.YELLOW, new Company("Tech Innovate", "Technology"), new Pet("Leo", "Dog")));
        ceos.add(new CEO("Alina", "Yang", 1020000000.0, 42, Color.ORANGE, new Company("Finance Pros", "Finance"), new Pet("Bella", "Cat")));
        ceos.add(new CEO("Roman", "Chen", 1150000000.0, 45, Color.PINK, new Company("Global Retail Solutions", "Retail"), new Pet("Jack", "Dog")));
        ceos.add(new CEO("Aubrey", "Li", 990000000.0, 39, Color.CYAN, new Company("Tech Pioneers", "Technology"), new Pet("Lily", "Parrot")));
        ceos.add(new CEO("Ronin", "Zhang", 1040000000.0, 41, Color.MAGENTA, new Company("Global Retail Hub", "Retail"), new Pet("Ziggy", "Cat")));
        ceos.add(new CEO("Ivy", "Gao", 1125000000.0, 47, Color.LIGHT_GRAY, new Company("Tech Revolution", "Technology"), new Pet("Luna", "Dog")));
        ceos.add(new CEO("Kaden", "Zhang", 1030000000.0, 42, Color.DARK_GRAY, new Company("Financial Experts Ltd.", "Finance"), new Pet("Charlie", "Cat")));
        ceos.add(new CEO("Skye", "Ward", 1090000000.0, 43, Color.BLUE, new Company("Retail Innovate", "Retail"), new Pet("Ziggy", "Dog")));
        ceos.add(new CEO("Landon", "Wu", 1200000000.0, 48, Color.RED, new Company("Innovate Tech", "Technology"), new Pet("Bella", "Parrot")));
        ceos.add(new CEO("Camila", "Chen", 1010000000.0, 40, Color.BLUE, new Company("Tech Innovate", "Technology"), new Pet("Mittens", "Cat")));
        ceos.add(new CEO("Blake", "Zhang", 1145000000.0, 44, Color.RED, new Company("Financial Innovations", "Finance"), new Pet("Coco", "Dog")));
        ceos.add(new CEO("Elliot", "Chen", 975000000.0, 37, Color.GREEN, new Company("Global Retail Solutions", "Retail"), new Pet("Lola", "Cat")));
        ceos.add(new CEO("Scarlett", "Wu", 1215000000.0, 48, Color.ORANGE, new Company("Tech Pioneers", "Technology"), new Pet("Zeus", "Parrot")));
        ceos.add(new CEO("Isaiah", "Zhang", 985000000.0, 39, Color.PINK, new Company("Global Retail Hub", "Retail"), new Pet("Shadow", "Dog")));
        ceos.add(new CEO("Nova", "Cheng", 1135000000.0, 43, Color.CYAN, new Company("Tech Revolution", "Technology"), new Pet("Sophie", "Cat")));
        ceos.add(new CEO("Hugo", "Feng", 945000000.0, 36, Color.MAGENTA, new Company("Financial Experts Ltd.", "Finance"), new Pet("Rocky", "Dog")));
        ceos.add(new CEO("Maya", "Wang", 1265000000.0, 47, Color.LIGHT_GRAY, new Company("Retail Innovate", "Retail"), new Pet("Oscar", "Cat")));
        ceos.add(new CEO("Archer", "Huang", 1055000000.0, 42, Color.DARK_GRAY, new Company("Tech Solutions Group", "Technology"), new Pet("Bentley", "Dog")));
        ceos.add(new CEO("Elena", "Cruz", 1125000000.0, 45, Color.BLUE, new Company("Global Retail Ventures", "Retail"), new Pet("Lily", "Parrot")));
        ceos.add(new CEO("Zander", "Schmidt", 955000000.0, 38, Color.RED, new Company("Tech Innovators", "Technology"), new Pet("Tiger", "Cat")));
        ceos.add(new CEO("Jocelyn", "Vargas", 1165000000.0, 46, Color.GREEN, new Company("Financial Solutions", "Finance"), new Pet("Daisy", "Dog")));
        ceos.add(new CEO("Jaxon", "Li", 1085000000.0, 43, Color.YELLOW, new Company("Global Retailers", "Retail"), new Pet("Charlie", "Parrot")));
        ceos.add(new CEO("Valentina", "Chen", 985000000.0, 39, Color.ORANGE, new Company("Innovate Tech", "Technology"), new Pet("Mia", "Cat")));
        ceos.add(new CEO("Evan", "Wu", 1195000000.0, 47, Color.PINK, new Company("Financial Experts", "Finance"), new Pet("Maximus", "Dog")));
        ceos.add(new CEO("Molly", "Wang", 995000000.0, 38, Color.CYAN, new Company("Smart Retail", "Retail"), new Pet("Smokey", "Cat")));
        ceos.add(new CEO("Xander", "Huang", 1080000000.0, 44, Color.MAGENTA, new Company("Tech Pioneers", "Technology"), new Pet("Ziggy", "Parrot")));
        ceos.add(new CEO("Paige", "Zhang", 965000000.0, 37, Color.LIGHT_GRAY, new Company("Financial Innovators Inc.", "Finance"), new Pet("Luna", "Dog")));
        ceos.add(new CEO("Dominic", "Perry", 1245000000.0, 49, Color.DARK_GRAY, new Company("Global Retail Hub", "Retail"), new Pet("Simba", "Cat")));
        ceos.add(new CEO("David", "Bischof", 30005000000.0, 40, Color.BLUE, new Company("Tech Revolution", "Technology"), new Pet("Milo", "Dog")));
        // endregion

        // natural Order sorting
        ceos.sort(null);
        // displayCEOs(ceos, 101, "Natural Order");

        // reverse order
        ceos.sort(Collections.reverseOrder());
        // displayCEOs(ceos, 101, "Reverse Order");


        // sorting based on first name
        ceos.sort(FirstNameComparator);
        // displayCEOs(ceos, 101, "First Name");

        // sorting based on last name
        ceos.sort(LastNameComparator);
        // displayCEOs(ceos, 101, "Last Name");

        // sorting based on net worth
        ceos.sort(NetWorthComparator);
        // displayCEOs(ceos, 101, "Net Worth");


        // sorting based on age
        ceos.sort(AgeComparator);
        // displayCEOs(ceos, 101, "Age");

        // sorting based on color
        ceos.sort(OfficeColorComparator);
        // displayCEOs(ceos, 101, "Office Color");

        // sorting based on company name
        ceos.sort(CompanyNameComparator);
        // displayCEOs(ceos, 101, "Company Name");

        // sorting based on pet type
        ceos.sort(PetTypeComparator);
        // displayCEOs(ceos, 101, "Pet Type");


// multi level sorting by name, age, net worth, and company name
        ceos.sort(MehrstufigerVergleich);
        //  displayCEOs(ceos, 101, "Multi Level");
    }

    // endregion

    // A method to sort the top richest CEOs based on net worth
    private static void sortTopRichest(CEO[] ceos) {
        Arrays.sort(ceos, (a, b) -> Double.compare(b.getNetWorth(), a.getNetWorth()));
    }


    // A method to display the top N richest CEOs
    private static void sortTopRichest(List<CEO> ceos) {
        ceos.sort(Comparator.comparingDouble(CEO::getNetWorth).reversed());
    }

    private static void displayCEOs(List<CEO> ceos, int topN, String sortType) {
        System.out.println("Sorted by " + sortType);
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < topN && i < ceos.size(); i++) {
            CEO currentCEO = ceos.get(i);
            System.out.println("Number in List: " + (i + 1));
            System.out.println("CEO Name: " + currentCEO.firstName + " " + currentCEO.lastName);
            System.out.println("Net Worth: $" + currentCEO.netWorth);
            System.out.println("Age: " + currentCEO.age);
            System.out.println("Office Color: " + getColorName(currentCEO.officeColor));
            System.out.println("Company: " + currentCEO.company.getName());
            System.out.println("Industry: " + currentCEO.company.getIndustry());
            System.out.println("Pet: " + currentCEO.pet.getName() + " the " + currentCEO.pet.getAnimalType());
            System.out.println("--------------------------------------------------");
        }
    }

    // Methode for getting the color name in English and not in RGB code
    private static String getColorName(Color color) {
        if (color.equals(Color.BLUE)) {
            return "Blue";
        } else if (color.equals(Color.RED)) {
            return "Red";
        } else if (color.equals(Color.GREEN)) {
            return "Green";
        } else if (color.equals(Color.YELLOW)) {
            return "Yellow";
        } else if (color.equals(Color.ORANGE)) {
            return "Orange";
        } else if (color.equals(Color.PINK)) {
            return "Pink";
        } else if (color.equals(Color.CYAN)) {
            return "Cyan";
        } else if (color.equals(Color.MAGENTA)) {
            return "Magenta";
        } else if (color.equals(Color.LIGHT_GRAY)) {
            return "Light Gray";
        } else if (color.equals(Color.DARK_GRAY)) {
            return "Dark Gray";
        } else {
            return "Unknown Color";
        }
    }
}

class Company {
    private String name;
    private String industry;

    public Company(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public String getIndustry() {
        return industry;
    }
}

class Pet {
    private String name;
    private String animalType;

    public Pet(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }
}
