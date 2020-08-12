package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Creating new instances
    // Updating existing ones
    // Deleting
    // Finding

}
