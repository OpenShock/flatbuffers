// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Example2

import com.google.flatbuffers.BaseVector
import com.google.flatbuffers.BooleanVector
import com.google.flatbuffers.ByteVector
import com.google.flatbuffers.Constants
import com.google.flatbuffers.DoubleVector
import com.google.flatbuffers.FlatBufferBuilder
import com.google.flatbuffers.FloatVector
import com.google.flatbuffers.LongVector
import com.google.flatbuffers.StringVector
import com.google.flatbuffers.Struct
import com.google.flatbuffers.Table
import com.google.flatbuffers.UnionVector
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.sign

@Suppress("unused")
class Monster : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Monster {
        __init(_i, _bb)
        return this
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_24_12_23()
        fun getRootAsMonster(_bb: ByteBuffer): Monster = getRootAsMonster(_bb, Monster())
        fun getRootAsMonster(_bb: ByteBuffer, obj: Monster): Monster {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun startMonster(builder: FlatBufferBuilder) = builder.startTable(0)
        fun endMonster(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
