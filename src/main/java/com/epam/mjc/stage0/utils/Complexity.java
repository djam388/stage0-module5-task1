package com.epam.mjc.stage0.utils;

public enum Complexity {
    /**
     * Tasks for assessing the algorithm complexity.
     * The following are the ratios of the constants with the BigO estimate:
     * <p>
     * Complexity.O_LOG_N       -> O(log N)
     * Complexity.O_N_2         -> O(log N^2)
     * Complexity.O_FACTORIAL_N -> O(!N)
     * Complexity.O_2_N         -> O(2 * N)
     * Complexity.O_N_LOG_N     -> O(N * log N)
     * Complexity.O_1           -> O(1)
     * Complexity.O_N           -> O(N)
     */

    O_LOG_N,
    O_N_2,
    O_FACTORIAL_N,
    O_2_N,
    O_N_LOG_N,
    O_1,
    O_N
}


