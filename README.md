# cloud-itonami-assoc-9411-cri-uccaep

Industry rule/history catalog for **UCCAEP** (Unión Costarricense de
Cámaras y Asociaciones del Sector Empresarial Privado) — an
entry aligned to **ISIC 9411** (activities of business,
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

Twenty entries, each carrying the page it came from
(`:source-article`) and the verbatim span the claim rests on
(`:source-quote`). Eighteen are first-party `uccaep.org` pages and
documents — the statutes (PDF), Executive Decree 35658-J as printed
in La Gaceta (PDF, hosted by UCCAEP), the code of business practice
(PDF), the 2020-2021 annual report (PDF), and the mission, principles,
objectives, BIAC/OIE, competitiveness-agenda, annual-report and board
pages. Two rest on `vlex.co.cr` for the founding.

**The July note that "neither `uccaep.or.cr` nor `uccaep.org`
rendered founding-history detail" is half-true and has been
replaced.** Measured 2026-09-11: both hosts serve the same site, and
it serves everything above. What it still does not serve, on any page
tried, is a founding year. `1973` is reached only by arithmetic —
vLex quotes Executive Decree 27442-C commemorating UCCAEP's creation
because it "en el año 1998 celebró su 25° aniversario" — so the
founding entry records that derivation (`:date-derivation
:anniversary-arithmetic`) and the checker verifies the subtraction
rather than looking for a year no source writes. 23 February is the
commemorative day the decree chose; it is not asserted as the
founding day.

The decree's own recitals give a *registry* date — the association
has been inscribed in the Registro de Asociaciones since 14 April
2004 (tomo 1, asiento 44) — which is recorded as what it is, not as
the founding.

### Reachability is not support

A URL that returns HTTP 200 without the claim reads exactly like one
that carries it, so every entry pins a verbatim span and `--live`
requires that span to still be in the fetched page.

And on this host, HTTP 200 is not even reachability. `uccaep.org`
answers a path that does not exist with its home page and a 200
(measured 2026-09-11: `/objetivos-no-such-page.html` → 200, 52,726
bytes, the home page). A rotted URL therefore stays "reachable", and
a quote that also appears on the home page — one entry here was
exactly that shape until its span was changed — would still
"support" it. So `--live` also fetches, per origin, a control path
that cannot exist, and reports `[soft-404]` for any source whose page
is the control's answer. Shown to bite: a one-character typo in a
PDF's filename produced exactly that finding.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on UCCAEP's behalf.

Coverage is reported honestly (see `association.facts/coverage`): an
association not in `catalog` has **no spec-basis**, full stop — never
fabricate one.

## Data

`data/datascript-tx.edn` is **the only place the facts are
authored**. Both readings are generated from it:

- `data/datascript-tx.edn` — the catalog, source of truth.
- `src/association/facts.kotoba` — the Clojure reading
  (`association.facts`). Generated.
- `src/association_facts.kotoba` — the Kotoba port, which reaches
  the Kotoba oracle, wasm and both native ISAs. Generated.
- `schema/association-rule.edn` — DataScript schema.

Query it alongside other `cloud-itonami`/`etzhayyim` compliance-fact
sources via `com-junkawasaki/root`'s
`scripts/compliance-fact-query.cljs`.

Dates are ISO with `:date-precision` saying how precisely the *source*
dates the fact. Costa Rican decrees write dates in words (`once de
noviembre de dos mil nueve`) and the Gazette writes `6 de enero del
2010`; the checker builds those Spanish forms for the specific date
being checked, so a span that names the date is accepted and one that
does not is a finding either way. An entry with no date says why
(`:date-unknown-because`); the statutes PDF, for instance, carries no
date in its text although the site names it "actualizados mayo 2016".

No personal name of any office-holder is persisted. The staff and
board pages carry names; they are cited only for what they say about
the institution.

## Checking it

```
nbb scripts/verify-catalog.cljk          # structural, offline
nbb scripts/verify-catalog.cljk --live   # fetch every :url (needs curl +
                                         # pdftotext), require every
                                         # :source-quote to still be in it,
                                         # and run the soft-404 control
nbb scripts/gen-kotoba-port.cljk --check # both readings match the data
clojure -M:parity                        # compile the Kotoba port and
                                         # compare every field of every
                                         # entry with the Clojure reading
```

Exit codes: `0` clean, `1` findings, `2` REFUSED (could not check —
not a pass). `clojure -M:test` collects nothing since the 2026-09-10
rename of `.clj`/`.cljc` to `.kotoba` and exits 0; `-M:parity` loads
both `.kotoba` files by path and is the run that counts.

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains UCCAEP's; this repo stores only citation metadata
(id/title/url/dates), not full text.
