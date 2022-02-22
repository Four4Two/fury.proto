//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryRedelegationsRequest(block: cosmos.staking.v1beta1.QueryRedelegationsRequestKt.Dsl.() -> Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsRequest =
  cosmos.staking.v1beta1.QueryRedelegationsRequestKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsRequest.newBuilder()).apply { block() }._build()
object QueryRedelegationsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsRequest = _builder.build()

    /**
     * <pre>
     * delegator_addr defines the delegator address to query for.
     * </pre>
     *
     * <code>string delegator_addr = 1;</code>
     */
    var delegatorAddr: kotlin.String
      @JvmName("getDelegatorAddr")
      get() = _builder.getDelegatorAddr()
      @JvmName("setDelegatorAddr")
      set(value) {
        _builder.setDelegatorAddr(value)
      }
    /**
     * <pre>
     * delegator_addr defines the delegator address to query for.
     * </pre>
     *
     * <code>string delegator_addr = 1;</code>
     */
    fun clearDelegatorAddr() {
      _builder.clearDelegatorAddr()
    }

    /**
     * <pre>
     * src_validator_addr defines the validator address to redelegate from.
     * </pre>
     *
     * <code>string src_validator_addr = 2;</code>
     */
    var srcValidatorAddr: kotlin.String
      @JvmName("getSrcValidatorAddr")
      get() = _builder.getSrcValidatorAddr()
      @JvmName("setSrcValidatorAddr")
      set(value) {
        _builder.setSrcValidatorAddr(value)
      }
    /**
     * <pre>
     * src_validator_addr defines the validator address to redelegate from.
     * </pre>
     *
     * <code>string src_validator_addr = 2;</code>
     */
    fun clearSrcValidatorAddr() {
      _builder.clearSrcValidatorAddr()
    }

    /**
     * <pre>
     * dst_validator_addr defines the validator address to redelegate to.
     * </pre>
     *
     * <code>string dst_validator_addr = 3;</code>
     */
    var dstValidatorAddr: kotlin.String
      @JvmName("getDstValidatorAddr")
      get() = _builder.getDstValidatorAddr()
      @JvmName("setDstValidatorAddr")
      set(value) {
        _builder.setDstValidatorAddr(value)
      }
    /**
     * <pre>
     * dst_validator_addr defines the validator address to redelegate to.
     * </pre>
     *
     * <code>string dst_validator_addr = 3;</code>
     */
    fun clearDstValidatorAddr() {
      _builder.clearDstValidatorAddr()
    }

    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4;</code>
     */
    var pagination: cosmos.base.query.v1beta1.Pagination.PageRequest
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4;</code>
     */
    fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an optional pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 4;</code>
     * @return Whether the pagination field is set.
     */
    fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsRequest.copy(block: cosmos.staking.v1beta1.QueryRedelegationsRequestKt.Dsl.() -> Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryRedelegationsRequest =
  cosmos.staking.v1beta1.QueryRedelegationsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()