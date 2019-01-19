class Phrase(val words: String) {


  def wordCount() : Map[String,Int] = {
    words.split(Array(' ', ',','.',':'))
      .map((x: String) => x.replaceAll("[^A-Za-z0-9' ]", ""))
      .map(e=>e.toLowerCase)
      .filter((p: String) => p.length != 0)
      .foldLeft(Map.empty[String, Int]){
      (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
    }
  }


}