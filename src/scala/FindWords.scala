import java.util

object FindWords {

  def findWords(words: Array[String]): Array[String] = {
    val map: Map[Char,Int] = Map[Char,Int]('q'-> 1, 'w'-> 1, 'e'-> 1, 'r'-> 1, 't'-> 1, 'y'-> 1, 'u'-> 1, 'i'-> 1, 'o'-> 1, 'p'-> 1,
        'a'-> 2, 's'-> 2, 'd'-> 2, 'f'-> 2, 'g'-> 2, 'h'-> 2, 'j'-> 2, 'k'-> 2, 'l'-> 2,
        'z'-> 3, 'x'-> 3, 'c'-> 3, 'v'-> 3, 'b'-> 3, 'n'-> 3, 'm'-> 3)
    val list = new util.ArrayList[String]()
    words.foreach(word => {
      val w = word.toLowerCase()
      val seq: Int = map(w(0))
      var count = 0
      w.foreach(c => {
        if (map(c) == seq) {
          count += 1
        }
      })
      if(count == w.length){
        list.add(word)
      }
    })
    val arr = new Array[String](list.size())
    list.toArray(arr)
  }

}
