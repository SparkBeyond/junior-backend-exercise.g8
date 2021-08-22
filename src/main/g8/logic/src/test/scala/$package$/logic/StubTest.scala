package $package$.logic

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class StubTest extends AnyFunSpec with Matchers {

  // placeholder for actual unit tests
  val stub = new Stub()
  describe("adding") {

    describe("one") {

      val one = 1

      it("and one should equal two") {
        stub.plus(one, 1) shouldBe 2
      }

      it("and two should equal three") {
        stub.plus(one, 2) shouldBe 3
      }
    }

    it("two and two should equal four") {
      stub.plus(2, 2) shouldBe 4
    }
  }
}
