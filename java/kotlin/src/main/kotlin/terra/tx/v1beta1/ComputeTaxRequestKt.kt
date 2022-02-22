//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: terra/tx/v1beta1/service.proto

package terra.tx.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun computeTaxRequest(block: terra.tx.v1beta1.ComputeTaxRequestKt.Dsl.() -> Unit): terra.tx.v1beta1.ServiceOuterClass.ComputeTaxRequest =
  terra.tx.v1beta1.ComputeTaxRequestKt.Dsl._create(terra.tx.v1beta1.ServiceOuterClass.ComputeTaxRequest.newBuilder()).apply { block() }._build()
object ComputeTaxRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: terra.tx.v1beta1.ServiceOuterClass.ComputeTaxRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: terra.tx.v1beta1.ServiceOuterClass.ComputeTaxRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): terra.tx.v1beta1.ServiceOuterClass.ComputeTaxRequest = _builder.build()

    /**
     * <pre>
     * tx is the transaction to simulate.
     * Deprecated. Send raw tx bytes instead.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [deprecated = true];</code>
     */
    @kotlin.Deprecated(message = "Field tx is deprecated") var tx: cosmos.tx.v1beta1.TxOuterClass.Tx
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * <pre>
     * tx is the transaction to simulate.
     * Deprecated. Send raw tx bytes instead.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [deprecated = true];</code>
     */
    fun clearTx() {
      _builder.clearTx()
    }
    /**
     * <pre>
     * tx is the transaction to simulate.
     * Deprecated. Send raw tx bytes instead.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [deprecated = true];</code>
     * @return Whether the tx field is set.
     */
    fun hasTx(): kotlin.Boolean {
      return _builder.hasTx()
    }

    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * </pre>
     *
     * <code>bytes tx_bytes = 2;</code>
     */
    var txBytes: com.google.protobuf.ByteString
      @JvmName("getTxBytes")
      get() = _builder.getTxBytes()
      @JvmName("setTxBytes")
      set(value) {
        _builder.setTxBytes(value)
      }
    /**
     * <pre>
     * tx_bytes is the raw transaction.
     * </pre>
     *
     * <code>bytes tx_bytes = 2;</code>
     */
    fun clearTxBytes() {
      _builder.clearTxBytes()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun terra.tx.v1beta1.ServiceOuterClass.ComputeTaxRequest.copy(block: terra.tx.v1beta1.ComputeTaxRequestKt.Dsl.() -> Unit): terra.tx.v1beta1.ServiceOuterClass.ComputeTaxRequest =
  terra.tx.v1beta1.ComputeTaxRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()