object Hamming {
  def compute(stand1:String,strand2:String): Int = {
    require(stand1.length == strand2.length,
      "Hamming distance is only defined for strings of equal length")
    stand1.toList.zip(strand2.toList).count(e => e._1 != e._2)
  }
}