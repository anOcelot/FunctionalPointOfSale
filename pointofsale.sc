(define tax_rate .065)
(define (tax rate subtotal) (* subtotal (+ 1 rate)))
(define (finish subtotal) (* tax_ratio subtotal))

(define (checkout value sub)
      (display "subtotal: ")(display sub)(display "\n")
      (cond
        
        ((= value -1)
          (display "Total: ")(display (tax .065 sub))
          (display "\n")
        )
        (else 
          (display "Item: $")
          
          (let ((v(read)))
              (if (= v -1)
                (checkout v (+ v sub))
                (checkout v (+ v sub))
              )    
          )
        )
      )
)


(define (checkout2 value sub)
      ;(display value)
      ;(display " ")
      ;(display sub)
      (display "Subtotal: $")(display sub)(display "\n")
      (cond
        ((= value -1)
          (display "\n")
          (display "Tax: ")(display (* sub (+ tax_rate 1)))
          (display "\n")
          (display "Total: ")(display (tax tax_rate sub))
        )
        (else
          (display "Item: $")
          (let ((v(read)))
              (cond 
                    ((= v -1)
                      (checkout2 v sub))
                    (else
                      (checkout2 v (+ v sub)))
              )    
          )
        )
      )
)

(define (run) 
  (display "pos system\n")
  (checkout2 0 0)
  )

(run)