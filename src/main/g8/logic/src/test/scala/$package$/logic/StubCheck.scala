package $package$.logic

import org.scalacheck.Prop.{forAll, propBoolean}
import org.scalacheck.{Gen, Properties}

class StubCheck extends Properties("Arithmetic addition") {

  // placeholder for actual property checks
  val ints: Gen[Int] = Gen.chooseNum(Int.MinValue, Int.MaxValue)
  val stub = new Stub()

  property("commutative") = forAll(ints, ints){ (i, j) =>
    stub.plus(i, j) == stub.plus(j, i)
  }

  property("associative") = forAll(ints, ints, ints){ (i, j, k) =>
    stub.plus(stub.plus(i, j), k) == stub.plus(i, stub.plus(j, k))
  }
}