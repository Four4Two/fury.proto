//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/authz/v1beta1/event.proto

package cosmos.authz.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun eventGrant(block: cosmos.authz.v1beta1.EventGrantKt.Dsl.() -> Unit): cosmos.authz.v1beta1.Event.EventGrant =
  cosmos.authz.v1beta1.EventGrantKt.Dsl._create(cosmos.authz.v1beta1.Event.EventGrant.newBuilder()).apply { block() }._build()
object EventGrantKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.authz.v1beta1.Event.EventGrant.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.authz.v1beta1.Event.EventGrant.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.authz.v1beta1.Event.EventGrant = _builder.build()

    /**
     * <pre>
     * Msg type URL for which an autorization is granted
     * </pre>
     *
     * <code>string msg_type_url = 2;</code>
     */
    var msgTypeUrl: kotlin.String
      @JvmName("getMsgTypeUrl")
      get() = _builder.getMsgTypeUrl()
      @JvmName("setMsgTypeUrl")
      set(value) {
        _builder.setMsgTypeUrl(value)
      }
    /**
     * <pre>
     * Msg type URL for which an autorization is granted
     * </pre>
     *
     * <code>string msg_type_url = 2;</code>
     */
    fun clearMsgTypeUrl() {
      _builder.clearMsgTypeUrl()
    }

    /**
     * <pre>
     * Granter account address
     * </pre>
     *
     * <code>string granter = 3;</code>
     */
    var granter: kotlin.String
      @JvmName("getGranter")
      get() = _builder.getGranter()
      @JvmName("setGranter")
      set(value) {
        _builder.setGranter(value)
      }
    /**
     * <pre>
     * Granter account address
     * </pre>
     *
     * <code>string granter = 3;</code>
     */
    fun clearGranter() {
      _builder.clearGranter()
    }

    /**
     * <pre>
     * Grantee account address
     * </pre>
     *
     * <code>string grantee = 4;</code>
     */
    var grantee: kotlin.String
      @JvmName("getGrantee")
      get() = _builder.getGrantee()
      @JvmName("setGrantee")
      set(value) {
        _builder.setGrantee(value)
      }
    /**
     * <pre>
     * Grantee account address
     * </pre>
     *
     * <code>string grantee = 4;</code>
     */
    fun clearGrantee() {
      _builder.clearGrantee()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.authz.v1beta1.Event.EventGrant.copy(block: cosmos.authz.v1beta1.EventGrantKt.Dsl.() -> Unit): cosmos.authz.v1beta1.Event.EventGrant =
  cosmos.authz.v1beta1.EventGrantKt.Dsl._create(this.toBuilder()).apply { block() }._build()