package example

import shared.SharedMessages
import utest._

object SharedTest extends TestSuite {

  def tests = TestSuite {
    'HelloWorld {
      assert(SharedMessages.itWorks == "It works!")
    }
  }
}
