// Custom exception for age validation
class InvalidAgeForVoterException extends Exception {
    public InvalidAgeForVoterException(String message) {
        super(message);
    }
}

// Vote class
class Vote {
    private String voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Vote(String voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "voterId='" + voterId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Main class to test the Vote class
public class VotingSystem {
    public static void main(String[] args) {
        try {
            Vote voter1 = new Vote("Karnataka0102", "Anu", 20);
            System.out.println(voter1);

            // Uncommenting the next line will throw InvalidAgeForVoterException
             //Vote voter2 = new Vote("Karnataka0103", "Venkatachala", 16);

        } catch (InvalidAgeForVoterException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


