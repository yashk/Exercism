class
Bob {

  def isSilence(x: String) = x.trim.isEmpty

  def hey(message : String) = message match {
    case x if(isSilence(x)) => "Fine. Be that way!"



  }


}