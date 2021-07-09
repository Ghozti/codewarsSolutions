package ghozti.codewars.solutions.kyu5;

import java.util.ArrayList;
import java.util.HashMap;

public class ZooDisaster {
    public static String[] whoEatsWho(final String zoo) {
        ArrayList<String> grass_eaters = new ArrayList<>();
        grass_eaters.add("antelope");
        grass_eaters.add("cow");
        grass_eaters.add("sheep");

        ArrayList<String> leave_eaters = new ArrayList<>();
        leave_eaters.add("bug");
        leave_eaters.add("bear");
        leave_eaters.add("giraffe");
        leave_eaters.add("panda");

        ArrayList<String> bug_eaters = new ArrayList<>();
        bug_eaters.add("bear");
        bug_eaters.add("chicken");

        ArrayList<String> little_fish_eaters = new ArrayList<>();
        little_fish_eaters.add("big-fish");

        ArrayList<String> big_fish_eaters = new ArrayList<>();
        big_fish_eaters.add("bear");

        ArrayList<String> chicken_eaters = new ArrayList<>();
        chicken_eaters.add("bear");
        chicken_eaters.add("fox");

        ArrayList<String> sheep_eaters = new ArrayList<>();
        sheep_eaters.add("bear");
        sheep_eaters.add("fox");

        ArrayList<String> cow_eaters = new ArrayList<>();
        cow_eaters.add("lion");
        cow_eaters.add("bear");

        ArrayList<String> antelop_eaters = new ArrayList<>();
        antelop_eaters.add("lion");

        HashMap<String,ArrayList<String>> pairs = new HashMap<>();
        pairs.put("grass",grass_eaters);
        pairs.put("leaves",leave_eaters);
        pairs.put("little-fish",little_fish_eaters);
        pairs.put("big-fish",big_fish_eaters);
        pairs.put("chicken",chicken_eaters);
        pairs.put("sheep",sheep_eaters);
        pairs.put("cow",cow_eaters);
        pairs.put("antelope",antelop_eaters);

        String[] zoo_arr = zoo.split(",");

        boolean only_predators_left = false;

        while(!only_predators_left){

        }

        return null;
    }
}

/*
Story
A freak power outage at the zoo has caused all of the electric cage doors to malfunction and swing open...

All the animals are out and some of them are eating each other!

It's a Zoo Disaster!
Here is a list of zoo animals, and what they can eat

antelope eats grass
big-fish eats little-fish
bug eats leaves
bear eats big-fish
bear eats bug
bear eats chicken
bear eats cow
bear eats leaves
bear eats sheep
chicken eats bug
cow eats grass
fox eats chicken
fox eats sheep
giraffe eats leaves
lion eats antelope
lion eats cow
panda eats leaves
sheep eats grass

Kata Task

INPUT
A comma-separated string representing all the things at the zoo

TASK
Figure out who eats whom until no more eating is possible.

OUTPUT
A list of strings (refer to the example below) where:

The first element is the initial zoo (same as INPUT)
The last element is a comma-separated string of what the zoo looks like when all the eating has finished
All other elements (2nd to last-1) are of the form X eats Y describing what happened
Notes
Animals can only eat things beside them

Animals always eat to their LEFT before eating to their RIGHT

Always the LEFTMOST animal capable of eating will eat before any others

Any other things you may find at the zoo (which are not listed above) do not eat anything and are not edible

Example
Input

"fox,bug,chicken,grass,sheep"

Working

1	fox can't eat bug
"fox,bug,chicken,grass,sheep"
2	bug can't eat anything
"fox,bug,chicken,grass,sheep"
3	chicken eats bug
"fox,chicken,grass,sheep"
4	fox eats chicken
"fox,grass,sheep"
5	fox can't eat grass
"fox,grass,sheep"
6	grass can't eat anything
"fox,grass,sheep"
7	sheep eats grass
"fox,sheep"
8	fox eats sheep
"fox"
Output

["fox,bug,chicken,grass,sheep", "chicken eats bug", "fox eats chicken", "sheep eats grass", "fox eats sheep", "fox"]
 */
