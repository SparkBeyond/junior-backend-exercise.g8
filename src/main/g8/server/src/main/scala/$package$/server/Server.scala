package $package$.server

object Server extends cask.MainRoutes {

  @cask.get("/keys")
  def listHashKeys(): cask.Response[String] = {
    // list registered hash keys, their creation time, and algorithm used. DO NOT RETURN SECRET SALT VALUES!
    cask.Response("Not Implemented", statusCode = 501)
  }

  @cask.postJson("/register/:hashKey")
  def register(hashKey: String, salt: Int, algorithm: String): cask.Response[String] = {
    // register a new hashing key that persists internally an algorithm and a salt for consistent hashing by key
    cask.Response("Not Implemented", statusCode = 501)
  }

  @cask.post("/hash/:hashKey")
  def hash(request: cask.Request): cask.Response[String] = {
    // hash `request.bytes` and return the hashed output as base64 string
    cask.Response("Not Implemented", statusCode = 501)
  }

  initialize()
}