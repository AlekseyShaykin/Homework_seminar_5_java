package JAVA.Homework_seminar_5;

public class Print_map extends Get_map {
    public static void main(String[] args) {
        System.out.println(mapColor(Get_map.labirintCreator())); 
        // возращает карту
    }
    static String mapColor(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                switch (map[row][col]) {
                    case 0:
                        sb.append("░░░"); // проход 176
                        break;
                    case -1:
                        sb.append("███"); // стена 178-219
                        break;
                    case -2:
                        sb.append("░К░"); // буква K 176
                        break;
                    case -3:
                        sb.append("░E░"); // буква E 176
                        break;
                    default:
                        break;
                }
            } // col
            sb.append("\n");
        } // row
        for (int i = 0; i < 3; i++) { // доб. внизу интервал в 3 строки
            sb.append("\n");
        }
        return sb.toString();
    }
}
    

