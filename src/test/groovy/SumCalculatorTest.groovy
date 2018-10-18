import spock.lang.Specification

class SumCalculatorTest extends Specification {

    def calc = new SumCalculator();

    def "sum return null for 0 entries"() {
        expect:
        calc.sum([]) == 0
    }


    def "sum return the correct value for 1 entries"() {
        expect:
        calc.sum([1]) == 1
    }

    def "sum return the correct value for many entries"() {
        expect:
        calc.sum([1, 2, 3, 4, 5]) == 15
    }


}
