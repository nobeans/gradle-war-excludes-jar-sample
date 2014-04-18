import org.apache.commons.lang3.*

class Hoge {

    def hoge() {
        return "Hoge: ${StringUtils.capitalize("foo")}"
    }
}
