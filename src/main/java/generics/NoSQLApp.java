package generics;

public class NoSQLApp {


    public static void main(String[] args) {
        NoSQLDB<Integer, String> col1 = new NoSQLDB();

        col1.collection.put(11, "sdfsdfsdf");
        col1.collection.put(22, "sdfsdfsdf");
        col1.collection.put(33, "sdfsdfsdf");
        col1.collection.put(55, "sdfsdfsdf");


        NoSQLDB<Object, Animals> animals = new NoSQLDB();

        animals.collection.put("Horse", new Animals("horse", "grey"));
        animals.collection.put("Horse", new Animals("horse", "grey"));
        animals.collection.put("Horse", new Animals("horse", "grey"));
        animals.collection.put("Horse", new Animals("horse", "grey"));
        animals.collection.put(new UniqID(), new Animals("horse", "grey"));
    }
}

class Animals{
    public Animals(String type, String color) {
        this.type = type;
        this.color = color;
    }

    String type;
    String color;
}

class UniqID{
    String hash;
}
