package Achivements;

import lombok.*;

@Data
@Builder
public class PlayerStats {
  private int  numberOfAttemptedAttacks;
  private int numberOfHits;
  private int totalAmountDamageDone;
  private int numberOfKillInGame;
  private int  numberOfFirstHit;
  private int numberOfAssists;
  private int numberOfSpellCast;
  private int spellCastDamage;
  private int timePlayed;
  private int totalGamesPlayed;
  private int totalDuration;
  private int totalKill;
  private int totalGamesWinned;
}
