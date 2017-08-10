package nl.patrickkik.darian

import java.time.temporal.Temporal
import java.time.temporal.TemporalAccessor
import java.time.temporal.TemporalAdjuster
import java.time.temporal.TemporalField

enum class SolOfWeek : TemporalAccessor, TemporalAdjuster {

    SOLIS,
    LUNAE,
    MARTIS,
    MERCURII,
    JOVIS,
    VENERIS,
    SATURNI;

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