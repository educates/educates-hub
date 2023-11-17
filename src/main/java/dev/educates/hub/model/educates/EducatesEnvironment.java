package dev.educates.hub.model.educates;

import java.util.Objects;

public class EducatesEnvironment {
    public String name;
    public EducatesWorkshop workshop;
    public int duration;
    public int capacity;
    public int reserved;
    public int allocated;
    public int available;

    public EducatesEnvironment() {
    }

    public EducatesEnvironment(String name, EducatesWorkshop workshop, int duration, int capacity, int reserved,
            int allocated, int available) {
        this.name = name;
        this.workshop = workshop;
        this.duration = duration;
        this.capacity = capacity;
        this.reserved = reserved;
        this.allocated = allocated;
        this.available = available;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EducatesWorkshop getWorkshop() {
        return this.workshop;
    }

    public void setWorkshop(EducatesWorkshop workshop) {
        this.workshop = workshop;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getReserved() {
        return this.reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public int getAllocated() {
        return this.allocated;
    }

    public void setAllocated(int allocated) {
        this.allocated = allocated;
    }

    public int getAvailable() {
        return this.available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public EducatesEnvironment name(String name) {
        this.name = name;
        return this;
    }

    public EducatesEnvironment workshop(EducatesWorkshop workshop) {
        this.workshop = workshop;
        return this;
    }

    public EducatesEnvironment duration(int duration) {
        this.duration = duration;
        return this;
    }

    public EducatesEnvironment capacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public EducatesEnvironment reserved(int reserved) {
        this.reserved = reserved;
        return this;
    }

    public EducatesEnvironment allocated(int allocated) {
        this.allocated = allocated;
        return this;
    }

    public EducatesEnvironment available(int available) {
        this.available = available;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EducatesEnvironment)) {
            return false;
        }
        EducatesEnvironment EducatesEnvironment = (EducatesEnvironment) o;
        return Objects.equals(name, EducatesEnvironment.name) && Objects.equals(workshop, EducatesEnvironment.workshop)
                && duration == EducatesEnvironment.duration && capacity == EducatesEnvironment.capacity
                && reserved == EducatesEnvironment.reserved && allocated == EducatesEnvironment.allocated
                && available == EducatesEnvironment.available;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, workshop, duration, capacity, reserved, allocated, available);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", workshop='" + getWorkshop() + "'" +
                ", duration='" + getDuration() + "'" +
                ", capacity='" + getCapacity() + "'" +
                ", reserved='" + getReserved() + "'" +
                ", allocated='" + getAllocated() + "'" +
                ", available='" + getAvailable() + "'" +
                "}";
    }

}