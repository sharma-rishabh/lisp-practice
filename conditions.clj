(defn days-in-month-case
  [month]
  (case month
    :February 28
    :April 30
    :June 30
    :September 30
    :November 30
    :January 31
    :March 31
    :May 31
    :July 31
    :August 31
    :October 31
    :December 31
    0))

(defn days-in-month-cond
  [month]
  (let [month-with-thirty-one-days #{:January :March :May :July :August :October :December}
        month-with-thirty-days #{:April :June :September :November}
        month-with-twenty-eight-days #{:February}]
    (cond
      (contains? month-with-thirty-days month) 30
      (contains? month-with-thirty-one-days month) 31
      (contains? month-with-twenty-eight-days month) 28)))

(days-in-month-case :July)
(days-in-month-cond :July)

(contains? #{1 2} 1)