# cloud-itonami-assoc-9411-cri-uccaep

Industry rule/history catalog for **UCCAEP** (Unión Costarricense de
Cámaras y Asociaciones del Sector Empresarial Privado) — the
TWENTY-THIRD entry aligned to **ISIC 9411** (activities of business,
employers, and professional membership organizations), alongside
[`-9411-sau-fsc`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-sau-fsc)
(Saudi Arabia),
[`-9411-aut-wko`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-aut-wko)
(Austria),
[`-9411-irl-ibec`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-irl-ibec)
(Ireland),
[`-9411-nzl-businessnz`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nzl-businessnz)
(New Zealand),
[`-9411-cze-spcr`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-cze-spcr)
(Czech Republic),
[`-9411-ind-cii`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ind-cii)
(India),
[`-9411-zaf-busa`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-zaf-busa)
(South Africa),
[`-9411-bra-cni`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-bra-cni)
(Brazil),
[`-9411-ken-kam`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ken-kam)
(Kenya),
[`-9411-can-chamber`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-can-chamber)
(Canada),
[`-9411-mex-coparmex`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-mex-coparmex)
(Mexico),
[`-9411-ita-confindustria`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-ita-confindustria)
(Italy),
[`-9411-nld-vnoncw`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-nld-vnoncw)
(Netherlands),
[`-9411-kor-kcci`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-kor-kcci)
(South Korea),
[`-9411-arg-uia`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-arg-uia)
(Argentina),
[`-9411-bel-feb`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-bel-feb)
(Belgium),
[`-9411-dnk-di`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-dnk-di)
(Denmark),
[`-9411-swe-sn`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-swe-sn)
(Sweden),
[`-9411-fin-ek`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-fin-ek)
(Finland),
[`-9411-tha-fti`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-tha-fti)
(Thailand),
[`-9411-chl-sofofa`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-chl-sofofa)
(Chile), and
[`-9411-col-andi`](https://github.com/cloud-itonami/cloud-itonami-assoc-9411-col-andi)
(Colombia). Part of the
[`cloud-itonami`](https://github.com/cloud-itonami) compliance-fact
family (ADR-2607141700, `cloud-itonami-compliance-fact-federation`,
in `com-junkawasaki/root`).

## Sourcing note

This repo fills Costa Rica's previously-open association-axis gap
(one of the 5-country gap list recorded at tick 157). Costa Rica now
has real, individually verified facts across all three axes: country
([`cloud-itonami-iso3166-cri`](https://github.com/cloud-itonami/cloud-itonami-iso3166-cri)),
municipality
([`cloud-itonami-municipality-cri-san-jose`](https://github.com/cloud-itonami/cloud-itonami-municipality-cri-san-jose)),
and association (this repo).

Neither `uccaep.or.cr` nor `uccaep.org` rendered founding-history
detail on any page tried this tick. Both entries here were instead
directly WebFetch-verified against a Costa Rican legal database
(`vlex.co.cr`), independent of UCCAEP itself. Since that source
explicitly does not confirm the exact day/month of the founding
(only the year, derived from a 25th-anniversary reference), this
catalog states only "1973" rather than asserting a specific day.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on UCCAEP's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association/facts.cljc` — the catalog, source of truth.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains UCCAEP's; this repo stores only citation metadata
(id/title/url/dates), not full text.
