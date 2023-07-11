package class_school.collection;
import java.util.*;

public class CollectionTest2 {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAge = new HashMap<>();
        nameAge.put('고길동',20);
        int age = nameAge.get('고길동');
        System.out.println(age);

        nameAge.put('일지매', 30);
        nameAge.put('박운수', 40);

        age = nameAge.get('박운수');
        System.out.println(age);

        HashMap<String, ArrayList<Sting>> teams = new HashMap<>()
        ArrayList<String> team1 = new ArrayList<>();
        team1.add('재')
        team1.add('현')
        team1.add('지')
        team1.add('서')
        team1.add('준')
        team1.add('주')
        
        ArrayList<String> team2 = new ArrayList<>();
        team2.add('일')
        team2.add('수')
        team2.add('범')
        team2.add('건')

        teams.put('1조', team1);
        teams.put('2조', team2);

        printTeamMember('1조', teams)
    }

    public void printTeamMember(String teamName, HashMap<String, ArrayList<String>> teams) {
        ArrayList<String> members = teams.get(teamName);
        System.out.println(teamName);
        for(String member : members) {
            System.out.println(member);
        }
    }
}
