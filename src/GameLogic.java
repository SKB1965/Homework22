public class GameLogic

    private GameRunner runner;
    public GameLogic(GameRunner runner){
        this.runner = runner;
//1st unit
    }
    public GameResult runGame(String playerName){
        Integer score = runGame();
        GameResult resulDt = buildResult(playerName, score);
        return result;
        // 2nd unit
    }

    public GameResult buildResult(String playerName, Integer score){
        GameResult result = new GameResult();
        result.setplayer(playerName);
        result.setscore(score);
        return rsult;

        // 3rd unit

    }
    private Integer renGame(){
        Integer score = 0;
        if(runner.isVictorious))){
            score = 10000;
        }
        else if (runner.isDefeated()){
            score = 100;
        }
        return score;
    }
    }

