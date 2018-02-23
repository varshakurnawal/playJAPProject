
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fidel113/WorkSpace/play-java-jpa-example6/conf/routes
// @DATE:Thu Feb 22 10:48:34 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
