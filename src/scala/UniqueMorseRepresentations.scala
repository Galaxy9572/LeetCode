import scala.collection.mutable

object org.jy.UniqueMorseRepresentations {

  def uniqueMorseRepresentations(words: Array[String]): Int = {
    if (words == null || words.length == 0) return 0
    val morseCodes = Array(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
      ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
      "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    val set = new mutable.HashSet[String]
    for (word <- words) {
      val stringBuilder = new StringBuilder
      for(i <- 0 until word.length) {
        val index = word.charAt(i).toInt - 97
        stringBuilder.append(morseCodes(index))
      }
      set.add(stringBuilder.toString)
    }
    set.size
  }

}
