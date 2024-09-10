object five {
  def countLetterOccurrences(words: List[String]): Int = {
    // Use map to transform words to their lengths and reduce to sum them up
    words.map(_.length).reduce(_ + _)
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalLetters = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalLetters")
  }
}

