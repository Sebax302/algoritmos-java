#!/usr/bin/env bash
raiz="$(cd "$(dirname "$0")" && pwd)"; tmp="$(mktemp -d)"; trap 'rm -rf "$tmp"' EXIT
ok=0; mal=0
for f in "$raiz"/bloque_*/*.java; do if javac -encoding UTF-8 -d "$tmp" "$f"; then ok=$((ok+1)); else mal=$((mal+1)); fi; done
echo "Compilados: $ok | fallos: $mal"; exit $((mal>0))
