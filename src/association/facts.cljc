(ns association.facts
  "Industry rule/history catalog for UCCAEP (Unión Costarricense de
  Cámaras y Asociaciones del Sector Empresarial Privado) -- a 65th
  industry-association-level source (see
  cloud-itonami-assoc-9411-sau-fsc, -9411-aut-wko, -9411-irl-ibec,
  -9411-nzl-businessnz, -9411-cze-spcr, -9411-ind-cii, -9411-zaf-busa,
  -9411-bra-cni, -9411-ken-kam, -9411-can-chamber, -9411-mex-coparmex,
  -9411-ita-confindustria, -9411-nld-vnoncw, -9411-kor-kcci,
  -9411-arg-uia, -9411-bel-feb, -9411-dnk-di, -9411-swe-sn, -9411-fin-ek,
  -9411-tha-fti, -9411-chl-sofofa, -9411-col-andi for the first
  twenty-two) per ADR-2607141700 (cloud-itonami-compliance-fact-
  federation). The TWENTY-THIRD entry aligned to ISIC 9411 (activities
  of business, employers, and professional membership organizations).
  Fills Costa Rica's previously-open association-axis gap (one of the
  5-country gap list recorded at tick 157) -- Costa Rica now has real,
  individually verified facts across ALL THREE axes (country:
  cloud-itonami-iso3166-cri statute.facts; municipality:
  cloud-itonami-municipality-cri-san-jose; association: this entry).

  Neither uccaep.or.cr nor uccaep.org rendered founding-history detail
  on any page tried this tick (multiple pages checked on both
  domains, all lacking historical content). Both entries here were
  instead directly WebFetch-verified against a Costa Rican legal
  database (vlex.co.cr, an independent legal-document repository, not
  UCCAEP's own site), which quotes verbatim: '[23 de febrero] en
  conmemoración de la fecha de creación de la Unión Costarricense de
  Cámaras y Asociaciones del Sector Empresarial Privado (Uccaep) ...
  la cual en el año 1998 celebró su 25° aniversario' (1998 minus 25
  years = 1973 founding), and 'mediante el Decreto Ejecutivo 27442-C,
  de 12 de noviembre de 1998, se declaró el 23 de febrero de cada año
  como Día Nacional de la Empresa Privada'. Because the source
  explicitly states it does not confirm the exact day/month of
  UCCAEP's original founding (only the year, via the anniversary
  arithmetic), this catalog states only '1973' rather than asserting
  '23 February 1973' as the precise founding date -- 23 February is
  the date CHOSEN to commemorate the anniversary, not confirmed here
  as the literal founding day.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"uccaep"
   [{:association-rule/id "uccaep.founding-1973"
     :association-rule/title "UCCAEP (Unión Costarricense de Cámaras y Asociaciones del Sector Empresarial Privado) founded in 1973 (derived from vLex legal database's direct quote that UCCAEP celebrated its 25th anniversary in 1998; exact day/month not confirmed by this source, so only the year is asserted)"
     :association-rule/association "uccaep"
     :association-rule/isic "9411"
     :association-rule/country "CRI"
     :association-rule/kind :governance-program
     :association-rule/url "https://vlex.co.cr/vid/declaracion-dia-nacional-empresa-940167862"
     :association-rule/url-provenance :legal-database-corroborated
     :association-rule/established-date "1973"
     :association-rule/retrieved-at "2026-07-18"
     :association-rule/topic #{:governance}}
    {:association-rule/id "uccaep.national-private-enterprise-day-decree-1998"
     :association-rule/title "Costa Rica's Executive Decree 27442-C, of 12 November 1998, declared 23 February of each year as 'Día Nacional de la Empresa Privada' in honor of UCCAEP's 25th anniversary (vLex legal database)"
     :association-rule/association "uccaep"
     :association-rule/isic "9411"
     :association-rule/country "CRI"
     :association-rule/kind :governance-program
     :association-rule/url "https://vlex.co.cr/vid/declaracion-dia-nacional-empresa-940167862"
     :association-rule/url-provenance :legal-database-corroborated
     :association-rule/established-date "1998-11-12"
     :association-rule/retrieved-at "2026-07-18"
     :association-rule/topic #{:governance}}]})

(defn spec-basis [association] (get catalog association))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-9411-cri-uccaep Wave 0 (ADR-2607141700): "
                 (count (get catalog "uccaep")) " UCCAEP entries seeded "
                 "with a Costa Rican legal database (vlex.co.cr) corroboration "
                 "(neither uccaep.or.cr nor uccaep.org rendered founding-history text this tick). "
                 "Extend `association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
