public class TennisGame {
    public static final int Love=0;
    public static final int FIFTEEN =1;
    public static final int THIRTY =2;
    public static final int FOURTY =3;
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore=0;
        boolean isScoreDeuce = m_score1==m_score2;
        if (isScoreDeuce)
        {
            switch (m_score1)
            {
                case Love:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FOURTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = m_score1;
                else { score+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case Love:
                        score+="Love";
                        break;
                    case FIFTEEN:
                        score+="Fifteen";
                        break;
                    case THIRTY:
                        score+="Thirty";
                        break;
                    case FOURTY:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
