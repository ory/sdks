#!/bin/bash
set -Eeuxo pipefail

# Mainly used by the CI tasks

# Both use the same arguments
./scripts/generate.sh $1 $2 $3
./scripts/test.sh $1 $2 $3
