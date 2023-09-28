all: init build proto-gen 

init:
	@echo "Pull External Protofiles"
	git submodule init
	git submodule update --remote

proto-gen: 
	@echo "Generating Protobuf files"
	cargo run --bin fury_proto_generator

build: 
	cargo build

publish:
	cargo publish -p fury-proto-rs

.PHONY: all proto-gen format init build publish
