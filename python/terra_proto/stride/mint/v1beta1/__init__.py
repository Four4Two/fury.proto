# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: stride/mint/v1beta1/genesis.proto, stride/mint/v1beta1/mint.proto, stride/mint/v1beta1/query.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import (
    TYPE_CHECKING,
    Dict,
    Optional,
)

import betterproto
import grpclib
from betterproto.grpc.grpclib_server import ServiceBase


if TYPE_CHECKING:
    import grpclib.server
    from betterproto.grpc.grpclib_client import MetadataLike
    from grpclib.metadata import Deadline


@dataclass(eq=False, repr=False)
class Minter(betterproto.Message):
    """Minter represents the minting state."""

    epoch_provisions: str = betterproto.string_field(1)
    """current epoch provisions"""


@dataclass(eq=False, repr=False)
class DistributionProportions(betterproto.Message):
    """next id: 5"""

    staking: str = betterproto.string_field(1)
    """
    staking defines the proportion of the minted minted_denom that is to be
    allocated as staking rewards.
    """

    community_pool_growth: str = betterproto.string_field(2)
    """
    community_pool defines the proportion of the minted mint_denom that is to
    be allocated to the community pool: growth.
    """

    community_pool_security_budget: str = betterproto.string_field(3)
    """
    community_pool defines the proportion of the minted mint_denom that is to
    be allocated to the community pool: security budget.
    """

    strategic_reserve: str = betterproto.string_field(4)
    """
    strategic_reserve defines the proportion of the minted mint_denom that is
    to be allocated to the pool: strategic reserve.
    """


@dataclass(eq=False, repr=False)
class Params(betterproto.Message):
    """Params holds parameters for the mint module."""

    mint_denom: str = betterproto.string_field(1)
    """type of coin to mint"""

    genesis_epoch_provisions: str = betterproto.string_field(2)
    """epoch provisions from the first epoch"""

    epoch_identifier: str = betterproto.string_field(3)
    """mint epoch identifier"""

    reduction_period_in_epochs: int = betterproto.int64_field(4)
    """number of epochs take to reduce rewards"""

    reduction_factor: str = betterproto.string_field(5)
    """reduction multiplier to execute on each period"""

    distribution_proportions: "DistributionProportions" = betterproto.message_field(6)
    """distribution_proportions defines the proportion of the minted denom"""

    minting_rewards_distribution_start_epoch: int = betterproto.int64_field(7)
    """start epoch to distribute minting rewards"""


@dataclass(eq=False, repr=False)
class QueryParamsRequest(betterproto.Message):
    """
    QueryParamsRequest is the request type for the Query/Params RPC method.
    """

    pass


@dataclass(eq=False, repr=False)
class QueryParamsResponse(betterproto.Message):
    """
    QueryParamsResponse is the response type for the Query/Params RPC method.
    """

    params: "Params" = betterproto.message_field(1)
    """params defines the parameters of the module."""


@dataclass(eq=False, repr=False)
class QueryEpochProvisionsRequest(betterproto.Message):
    """
    QueryEpochProvisionsRequest is the request type for the
    Query/EpochProvisions RPC method.
    """

    pass


@dataclass(eq=False, repr=False)
class QueryEpochProvisionsResponse(betterproto.Message):
    """
    QueryEpochProvisionsResponse is the response type for the
    Query/EpochProvisions RPC method.
    """

    epoch_provisions: bytes = betterproto.bytes_field(1)
    """epoch_provisions is the current minting per epoch provisions value."""


@dataclass(eq=False, repr=False)
class GenesisState(betterproto.Message):
    """GenesisState defines the mint module's genesis state."""

    minter: "Minter" = betterproto.message_field(1)
    """minter is a space for holding current rewards information."""

    params: "Params" = betterproto.message_field(2)
    """params defines all the paramaters of the module."""

    reduction_started_epoch: int = betterproto.int64_field(3)
    """current reduction period start epoch"""


class QueryStub(betterproto.ServiceStub):
    async def params(
        self,
        query_params_request: "QueryParamsRequest",
        *,
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["MetadataLike"] = None
    ) -> "QueryParamsResponse":
        return await self._unary_unary(
            "/stride.mint.v1beta1.Query/Params",
            query_params_request,
            QueryParamsResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def epoch_provisions(
        self,
        query_epoch_provisions_request: "QueryEpochProvisionsRequest",
        *,
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["MetadataLike"] = None
    ) -> "QueryEpochProvisionsResponse":
        return await self._unary_unary(
            "/stride.mint.v1beta1.Query/EpochProvisions",
            query_epoch_provisions_request,
            QueryEpochProvisionsResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )


class QueryBase(ServiceBase):
    async def params(
        self, query_params_request: "QueryParamsRequest"
    ) -> "QueryParamsResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def epoch_provisions(
        self, query_epoch_provisions_request: "QueryEpochProvisionsRequest"
    ) -> "QueryEpochProvisionsResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_params(
        self, stream: "grpclib.server.Stream[QueryParamsRequest, QueryParamsResponse]"
    ) -> None:
        request = await stream.recv_message()
        response = await self.params(request)
        await stream.send_message(response)

    async def __rpc_epoch_provisions(
        self,
        stream: "grpclib.server.Stream[QueryEpochProvisionsRequest, QueryEpochProvisionsResponse]",
    ) -> None:
        request = await stream.recv_message()
        response = await self.epoch_provisions(request)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/stride.mint.v1beta1.Query/Params": grpclib.const.Handler(
                self.__rpc_params,
                grpclib.const.Cardinality.UNARY_UNARY,
                QueryParamsRequest,
                QueryParamsResponse,
            ),
            "/stride.mint.v1beta1.Query/EpochProvisions": grpclib.const.Handler(
                self.__rpc_epoch_provisions,
                grpclib.const.Cardinality.UNARY_UNARY,
                QueryEpochProvisionsRequest,
                QueryEpochProvisionsResponse,
            ),
        }
