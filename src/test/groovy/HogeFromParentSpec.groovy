import spock.lang.Specification

class HogeFromParentSpec extends Specification {

    def "hoge from parent"() {
        expect:
        new Hoge().hoge() == "Hoge!?"
    }
}
