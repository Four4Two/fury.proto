/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";
import { Any } from "../../../google/protobuf/any";

export const protobufPackage = "cosmos.app.v1alpha1";

/**
 * Config represents the configuration for a Cosmos SDK ABCI app.
 * It is intended that all state machine logic including the version of
 * baseapp and tx handlers (and possibly even Tendermint) that an app needs
 * can be described in a config object. For compatibility, the framework should
 * allow a mixture of declarative and imperative app wiring, however, apps
 * that strive for the maximum ease of maintainability should be able to describe
 * their state machine with a config object alone.
 */
export interface Config {
  /** modules are the module configurations for the app. */
  modules: ModuleConfig[];
  /**
   * golang_bindings specifies explicit interface to implementation type bindings which
   * depinject uses to resolve interface inputs to provider functions.  The scope of this
   * field's configuration is global (not module specific).
   */
  golangBindings: GolangBinding[];
}

/** ModuleConfig is a module configuration for an app. */
export interface ModuleConfig {
  /**
   * name is the unique name of the module within the app. It should be a name
   * that persists between different versions of a module so that modules
   * can be smoothly upgraded to new versions.
   *
   * For example, for the module cosmos.bank.module.v1.Module, we may chose
   * to simply name the module "bank" in the app. When we upgrade to
   * cosmos.bank.module.v2.Module, the app-specific name "bank" stays the same
   * and the framework knows that the v2 module should receive all the same state
   * that the v1 module had. Note: modules should provide info on which versions
   * they can migrate from in the ModuleDescriptor.can_migration_from field.
   */
  name: string;
  /**
   * config is the config object for the module. Module config messages should
   * define a ModuleDescriptor using the cosmos.app.v1alpha1.is_module extension.
   */
  config?: Any;
  /**
   * golang_bindings specifies explicit interface to implementation type bindings which
   * depinject uses to resolve interface inputs to provider functions.  The scope of this
   * field's configuration is module specific.
   */
  golangBindings: GolangBinding[];
}

/** GolangBinding is an explicit interface type to implementing type binding for dependency injection. */
export interface GolangBinding {
  /** interface_type is the interface type which will be bound to a specific implementation type */
  interfaceType: string;
  /** implementation is the implementing type which will be supplied when an input of type interface is requested */
  implementation: string;
}

const baseConfig: object = {};

export const Config = {
  encode(message: Config, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.modules) {
      ModuleConfig.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    for (const v of message.golangBindings) {
      GolangBinding.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Config {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseConfig } as Config;
    message.modules = [];
    message.golangBindings = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.modules.push(ModuleConfig.decode(reader, reader.uint32()));
          break;
        case 2:
          message.golangBindings.push(GolangBinding.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Config {
    const message = { ...baseConfig } as Config;
    message.modules = [];
    message.golangBindings = [];
    if (object.modules !== undefined && object.modules !== null) {
      for (const e of object.modules) {
        message.modules.push(ModuleConfig.fromJSON(e));
      }
    }
    if (object.golangBindings !== undefined && object.golangBindings !== null) {
      for (const e of object.golangBindings) {
        message.golangBindings.push(GolangBinding.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: Config): unknown {
    const obj: any = {};
    if (message.modules) {
      obj.modules = message.modules.map((e) => (e ? ModuleConfig.toJSON(e) : undefined));
    } else {
      obj.modules = [];
    }
    if (message.golangBindings) {
      obj.golangBindings = message.golangBindings.map((e) => (e ? GolangBinding.toJSON(e) : undefined));
    } else {
      obj.golangBindings = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<Config>): Config {
    const message = { ...baseConfig } as Config;
    message.modules = [];
    message.golangBindings = [];
    if (object.modules !== undefined && object.modules !== null) {
      for (const e of object.modules) {
        message.modules.push(ModuleConfig.fromPartial(e));
      }
    }
    if (object.golangBindings !== undefined && object.golangBindings !== null) {
      for (const e of object.golangBindings) {
        message.golangBindings.push(GolangBinding.fromPartial(e));
      }
    }
    return message;
  },
};

const baseModuleConfig: object = { name: "" };

export const ModuleConfig = {
  encode(message: ModuleConfig, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.config !== undefined) {
      Any.encode(message.config, writer.uint32(18).fork()).ldelim();
    }
    for (const v of message.golangBindings) {
      GolangBinding.encode(v!, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ModuleConfig {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseModuleConfig } as ModuleConfig;
    message.golangBindings = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.config = Any.decode(reader, reader.uint32());
          break;
        case 3:
          message.golangBindings.push(GolangBinding.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ModuleConfig {
    const message = { ...baseModuleConfig } as ModuleConfig;
    message.golangBindings = [];
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.config !== undefined && object.config !== null) {
      message.config = Any.fromJSON(object.config);
    } else {
      message.config = undefined;
    }
    if (object.golangBindings !== undefined && object.golangBindings !== null) {
      for (const e of object.golangBindings) {
        message.golangBindings.push(GolangBinding.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: ModuleConfig): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.config !== undefined && (obj.config = message.config ? Any.toJSON(message.config) : undefined);
    if (message.golangBindings) {
      obj.golangBindings = message.golangBindings.map((e) => (e ? GolangBinding.toJSON(e) : undefined));
    } else {
      obj.golangBindings = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<ModuleConfig>): ModuleConfig {
    const message = { ...baseModuleConfig } as ModuleConfig;
    message.golangBindings = [];
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.config !== undefined && object.config !== null) {
      message.config = Any.fromPartial(object.config);
    } else {
      message.config = undefined;
    }
    if (object.golangBindings !== undefined && object.golangBindings !== null) {
      for (const e of object.golangBindings) {
        message.golangBindings.push(GolangBinding.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGolangBinding: object = { interfaceType: "", implementation: "" };

export const GolangBinding = {
  encode(message: GolangBinding, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.interfaceType !== "") {
      writer.uint32(10).string(message.interfaceType);
    }
    if (message.implementation !== "") {
      writer.uint32(18).string(message.implementation);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GolangBinding {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGolangBinding } as GolangBinding;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.interfaceType = reader.string();
          break;
        case 2:
          message.implementation = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GolangBinding {
    const message = { ...baseGolangBinding } as GolangBinding;
    if (object.interfaceType !== undefined && object.interfaceType !== null) {
      message.interfaceType = String(object.interfaceType);
    } else {
      message.interfaceType = "";
    }
    if (object.implementation !== undefined && object.implementation !== null) {
      message.implementation = String(object.implementation);
    } else {
      message.implementation = "";
    }
    return message;
  },

  toJSON(message: GolangBinding): unknown {
    const obj: any = {};
    message.interfaceType !== undefined && (obj.interfaceType = message.interfaceType);
    message.implementation !== undefined && (obj.implementation = message.implementation);
    return obj;
  },

  fromPartial(object: DeepPartial<GolangBinding>): GolangBinding {
    const message = { ...baseGolangBinding } as GolangBinding;
    if (object.interfaceType !== undefined && object.interfaceType !== null) {
      message.interfaceType = object.interfaceType;
    } else {
      message.interfaceType = "";
    }
    if (object.implementation !== undefined && object.implementation !== null) {
      message.implementation = object.implementation;
    } else {
      message.implementation = "";
    }
    return message;
  },
};

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined | Long;
export type DeepPartial<T> = T extends Builtin
  ? T
  : T extends Array<infer U>
  ? Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U>
  ? ReadonlyArray<DeepPartial<U>>
  : T extends {}
  ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}
