package $package$.server

object Server extends cask.MainRoutes {

  @cask.get("/keys")
  def listHashKeys(): String = {
    // list registered hash keys, their creation time, and algorithm used. DO NOT RETURN SECRET SALT VALUES!
    ???
  }

  @cask.postJson("/register/:hashKey")
  def register(hashKey: String, salt: Int, algorithm: String): String = {
    // register a new hashing key that persists internally an algorithm and a salt for consistent hashing by key
    ???
  }

  @cask.post("/hash/:hashKey")
  def hash(request: cask.Request): String = {
    // hash `request.bytes` and return the hashed output as base64 string
    ???
  }

  initialize()
}