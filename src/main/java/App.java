// import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;
//
//
// public class App {
//   public static void main(String[] args) {
//     staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//         HashMap model = new HashMap();
//         model.put("template", "templates/index.vtl" );
//         return new ModelAndView(model, "templates/layout.vtl");
//       }, new VelocityTemplateEngine());
//
//     get("/results", (request, response) -> {
//         HashMap model = new HashMap();
//         model.put("template", "templates/results.vtl" );
//
//         String word1 = request.queryParams("player1");
//         String word2 = request.queryParams("player2");
//         Game myGame = new Game();
//         Boolean winner = myGame.checkWinner(word1, word2);
//         String outputString = "";
//
//         if (winner == null) {
//           outputString = "It's a tie!";
//         } else {
//           if (winner.equals(true)) {
//             outputString = String.format("Player 1 - %s - WINS!!!", word1);
//           } else if (winner.equals(false)) {
//             outputString = String.format("Player 2 - %s - WINS!!!", word2);
//           }
//         }
//
//         model.put("results", outputString);
//         return new ModelAndView(model, "templates/layout.vtl");
//       }, new VelocityTemplateEngine());
//
//   }
// }
