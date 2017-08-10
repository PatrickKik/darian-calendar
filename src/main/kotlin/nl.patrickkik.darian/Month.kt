package nl.patrickkik.darian

import java.time.temporal.*

enum class Month : TemporalAccessor, TemporalAdjuster {

    SAGITTARIUS, DHANUS, CAPRICORNUS, MAKARA, AQUARIUS, KUMBHA,
    PISCES, MINA, ARIES, MESHA, TAURUS, RISHABHA,
    GEMINI, MITHUNA, CANCER, KARKA, LEO, SIMHA,
    VIRGO, KANYA, LIBRA, TULA, SCORPIUS, VRISHIKA;

    fun getValue(): Int = ordinal + 1

    override fun getLong(field: TemporalField?): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isSupported(field: TemporalField?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun adjustInto(temporal: Temporal?): Temporal {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}