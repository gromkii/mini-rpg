/*
  Defines Fighter class, with base stats and actions.
 */

package Player;

public class Fighter extends PlayerCharacter {
  public Fighter(){
    characterName = "Fighter Dude";
    characterClass = "Fighter";
    stats.put("strength", 18);
    stats.put("intelligence", 11);
    stats.put("speed", 13);
    stats.put("luck", 12);
  }
  public Fighter(String fighterName) {
    characterName = fighterName;
    characterClass = "Fighter";
    stats.put("strength", 18);
    stats.put("intelligence", 11);
    stats.put("speed", 13);
    stats.put("luck", 12);
  }

  public Fighter(String fighterName, String fighterClass) {
    characterName = fighterName;
    characterClass = fighterClass;
    stats.put("strength", 18);
    stats.put("intelligence", 11);
    stats.put("speed", 13);
    stats.put("luck", 12);
  }
}
