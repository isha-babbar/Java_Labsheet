public class Library {
    class Member {
        String name;
        int id;

        Member(String name, int id) {
            this.name = name;
            this.id = id;
        }

        void display() {
            System.out.println("Member: " + name + ", ID: " + id);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Member m1 = library.new Member("Shahvez", 101);
        m1.display();
    }
}