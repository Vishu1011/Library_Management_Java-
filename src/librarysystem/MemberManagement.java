package librarysystem;

public class MemberManagement {

    // Define the Member class
    public class Member {
        int memberId;
        String name;

        public Member(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }
    }

    // Array to store Member objects and a counter
    private Member[] members;
    private int num;

    // Constructor for librarysystem.MemberManagement
    public MemberManagement() {
        members = new Member[20]; // Initialize the array with a size of 20
        num = 0; // Initialize the number of members
    }

    // Method to add a member
    public void addMember(int memberId, String name) {
        if (num < members.length) { // Check if there is space in the array
            members[num] = new Member(memberId, name);
            num++;
            System.out.println("Member added: ID " + memberId + ", Name " + name);
        } else {
            System.out.println("Member list is full.");
        }
    }

    // Method to find a member by ID
    public int findMemberById(int memberId) {
        for (int i = 0; i < num; i++) {
            if (members[i].memberId == memberId) {
                return i;
            }
        }
        return -1; // Member not found
    }

    // Method to display member details
    public void displayMemberDetails(int memberIndex) {
        if (memberIndex >= 0 && memberIndex < num) { // Check if the index is valid
            Member member = members[memberIndex];
            System.out.println("Member ID: " + member.memberId + ", Name: " + member.name);
        } else {
            System.out.println("Invalid member index.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        MemberManagement management = new MemberManagement();

        // Adding members
        management.addMember(1, "Vidhi");
        management.addMember(2, "shubham");

        // Finding a member by ID and displaying details
        int index = management.findMemberById(1);
        management.displayMemberDetails(index); // Should display details of Vidhi

        // Trying to display a member with an invalid index
        management.displayMemberDetails(10); // Should display "Invalid member index."
    }
}