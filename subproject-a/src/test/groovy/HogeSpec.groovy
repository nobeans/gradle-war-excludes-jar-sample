import spock.lang.Specification

class HogeSpec extends Specification {

    def "hoge"() {
        expect:
        new Hoge().hoge() == "Hoge: Foo"
    }
}
